package ems.com.dao;

import java.util.List;

import ems.com.model.Employee;

/**
 * @author rahulb9
 *
 */
public interface EmployeeDao {
	
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
	List<Employee> searchEmployee(long empId,String name);
	/**
	 * @param empId
	 * @return
	 */
	String deleteEmployee(int empId);
	/**
	 * @param emp
	 * @return
	 */
	String updateEmployee(int empId,Employee emp);
	/**
	 * @return
	 */
	List<Employee> getAllEmployee();
	
}
