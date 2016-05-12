package ems.com.dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ems.com.model.Address;
import ems.com.model.Department;
import ems.com.model.Employee;

public class EmployeeMapper implements RowMapper  {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee=new Employee();
		
		employee.setAddress(getAddress());
		employee.setDept(getDepartment());
		employee.setEmpDesg(rs.getString("emp_desig"));
		employee.setEmpId(rs.getInt("emp_id"));
		employee.setEmpName(rs.getString("emp_name"));
		employee.setSalary(rs.getDouble("emp_sal"));
		return employee;
	}	
	
	private Department getDepartment() {
		Department department=new Department();
		department.setDeptId(12);
		department.setDeptName("ROJA");
		return department;
	}

	private Address getAddress() {
		Address address=new Address();
		address.setAddSeqId(11);
		address.setCity("Indore");
		address.setState("MP");
		address.setStreet("E-16");
		address.setZipCode(477022);
		return address;
	}
}
