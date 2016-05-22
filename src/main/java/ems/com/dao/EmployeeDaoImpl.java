package ems.com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import ems.com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	   
	public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<Employee> searchEmployee(long empId, String name) {
		
		String sql="select * from employee_temp where emp_id= ? or emp_name=?";
		@SuppressWarnings("unchecked")
		List<Employee> employeesList=jdbcTemplateObject.query(sql, new Object[]{empId,name}, new EmployeeMapper());
		return employeesList;
	}

	public String deleteEmployee(int empId) {
		String sql="delete from employee_temp where emp_id=?";
		 jdbcTemplateObject.update(sql,empId);
		 return "deleted";
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee() {
		String sql="select * from  employee_temp";
		return jdbcTemplateObject.query(sql, new EmployeeMapper());
	}

	
	
	public int addEmployee(Employee employee) {
		      String SQL = "insert into employee_temp(emp_name,emp_sal,emp_desig,address,dept) values(?,?,?,?,?)";		      
		      jdbcTemplateObject.update( SQL, employee.getEmpName(),employee.getSalary(),employee.getEmpDesg(),
		    		  employee.getAddress().toString(),employee.getDept().toString());
		      System.out.println("Created Record Name = " +employee.getEmpName() + " Id = " + employee.getEmpId());
			return 0;
	}

	public String updateEmployee(int empId,Employee employee) {
		
		String sql="update employee_temp set emp_name=?, emp_desig=?,emp_sal=?,address=?,dept=? where"
				+ "  emp_id=?";
		jdbcTemplateObject.update(sql, employee.getEmpName(),employee.getEmpDesg(),employee.getSalary(),
		    		  employee.getAddress().toString(),employee.getDept().toString(),empId);
		return "updated";
	}

}
