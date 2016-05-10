package ems.com.dao;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ems.com.model.Address;
import ems.com.model.Department;
import ems.com.model.Employee;
import junit.framework.Assert;

public class EmployeeDaoImplTest {
	static ApplicationContext context;
	static EmployeeDao dao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 context =  new ClassPathXmlApplicationContext("beansJDBC.xml");
		 dao = (EmployeeDaoImpl)context.getBean("employeeDaoImpl");
	}
	
	@Test
	public final void addEmployeeTest() {
		Employee employee=new Employee();
		employee.setEmpName("RahulSingh");
		Address address=getAddress();
		Department department=getDepartment();
		employee.setDept(department);
		employee.setSalary(45632.02);
		employee.setAddress(address);
		employee.setEmpDesg("SE");
		Assert.assertEquals(0, dao.addEmployee(employee));
	}

	@Test
	public final void searchEmployeeTest(){
		List<Employee> employeeList= dao.searchEmployee(0, "RahulSingh");
		if(!employeeList.isEmpty() && employeeList != null){
			for(Employee employee:employeeList){
					System.out.println("ID: "+employee.getEmpId()+"  Name :"+employee.getEmpName());
			}
		}
		Assert.assertNotNull(employeeList);
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
