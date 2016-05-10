package ems.com.service;

import java.util.List;

import ems.com.dao.EmployeeDao;
import ems.com.model.Employee;
import ems.com.util.CommonUtils;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao dao = CommonUtils.getDaoObject();

	public int addEmployee(Employee employee) {
		if (employee != null) {
			dao.addEmployee(employee);
		}
		return 0;
	}
	public List<Employee> searchEmployee(int empId, String name) {
		List<Employee> employeeList = null;
		if (name != null || empId != 0) {

			employeeList = dao.searchEmployee(empId, name);
		}
		return employeeList;
	}

	public String deleteEmployee(int empId) {
		return dao.deleteEmployee(empId);
	}

	public String updateEmployee(Employee emp) {
		return dao.updateEmployee(emp);
	}

	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}

}
