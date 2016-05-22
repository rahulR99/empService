package ems.com.service;

import java.util.List;

import ems.com.dao.EmployeeDao;
import ems.com.model.Employee;
import ems.com.util.CommonUtils;

public class EmployeeServiceImpl implements EmployeeService {
	private static EmployeeDao dao;
	static{	
			dao = CommonUtils.getDaoObject();
		}
	public EmployeeServiceImpl(){
		
	}
	public String addEmployee(Employee employee) {
		if (employee != null) {
			this.dao.addEmployee(employee);
		}
		return "SAved";
	}
	public List<Employee> searchEmployee(long empId, String name) {
		List<Employee> employeeList = null;
		if (name != null || empId != 0) {

			employeeList = this.dao.searchEmployee(empId, name);
		}
		return employeeList;
	}

	public String deleteEmployee(int empId) {
		return this.dao.deleteEmployee(empId);
	}

	public String updateEmployee(int empId,Employee emp) {
		return this.dao.updateEmployee(empId,emp);
	}

	public List<Employee> getAllEmployee() {
		return this.dao.getAllEmployee();
	}

}
