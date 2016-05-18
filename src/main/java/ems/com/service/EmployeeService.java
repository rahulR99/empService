package ems.com.service;

import java.util.List;

import ems.com.model.Employee;

public interface EmployeeService {
	/**
	 * @param employee
	 * @return
	 */
	int  addEmployee(Employee employee);
	
	/**
	 * @param id
	 * @param name
	 * @return
	 */
	List<Employee> searchEmployee(long id,String name);
	/**
	 * @param empId
	 * @return
	 */
	String deleteEmployee(int empId);
	/**
	 * @param emp
	 * @return
	 */
	String updateEmployee(Employee emp);
	/**
	 * @return
	 */
	List<Employee> getAllEmployee();
	
}
