package ems.com.service;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ems.com.model.Address;
import ems.com.model.Department;
import ems.com.model.Employee;

public class EmployeeServiceImplTest {
	static EmployeeService employeeService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 employeeService=new EmployeeServiceImpl();
	}

	@Test
	public void testAddEmployee() {
		Employee employee=new Employee();
		employee.setEmpName("RahulSingh11");
		Address address=getAddress();
		Department department=getDepartment();
		employee.setDept(department);
		employee.setSalary(45632.02);
		employee.setAddress(address);
		employee.setEmpDesg("SE");
		employeeService.addEmployee(employee);
		assertTrue(true);
	}

	@Test
	public void testSearchEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateEmployee() {
		Employee employee=new Employee();
		employee.setEmpName("RahulSingh11");
		Address address=getAddress();
		Department department=getDepartment();
		employee.setDept(department);
		employee.setSalary(45632.02);
		employee.setAddress(address);
		employee.setEmpDesg("SE");
		employeeService.updateEmployee(2,employee);
		assertTrue(true);
	}

	@Test
	public void testGetAllEmployee() {
		//employeeService.getAllEmployee();
		System.out.println(employeeService.getAllEmployee().get(0).toString());
		assertTrue(true);
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
