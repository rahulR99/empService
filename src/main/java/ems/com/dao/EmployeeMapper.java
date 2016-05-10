package ems.com.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import ems.com.model.Employee;

public class EmployeeMapper implements RowMapper  {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee=new Employee();
		//employee.setAddress(rs.getString("address"));
		//employee.setDept(rs.getString("dept"));
		employee.setEmpDesg(rs.getString("emp_desig"));
		employee.setEmpId(rs.getInt("emp_id"));
		employee.setEmpName(rs.getString("emp_name"));
		employee.setSalary(rs.getDouble("emp_sal"));
		return employee;
	}	
}
