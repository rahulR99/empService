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
	 * @param empId
	 * @param name
	 * @return
	 */
	List<Employee> searchEmployee(int empId,String name);
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
