package ems.com.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import ems.com.model.Employee;
import ems.com.service.EmployeeService;
import ems.com.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
/************************************ Delete an Employee ***************************************/
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public @ResponseBody
	String deleteEmployee(@PathVariable("id") int id) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		String output = employeeService.deleteEmployee(id);
		System.out.println("Fetching & Deleting User with id " + id);
		return output;
	}

/************************* retrieving all the employee ***********************************************/
	@RequestMapping(value = "/list", produces = "application/json", method = RequestMethod.GET)
	public @ResponseBody
	String getAllEmployee() {
		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employeeList = null;
		String jsonOutput = null;
		if ((employeeList = employeeService.getAllEmployee()) != null) {
			jsonOutput = getJson(employeeList);
		}
		System.out.println(jsonOutput);
		return jsonOutput;
	}

/***************** retrieving one employee **************************************************/
	@RequestMapping(value = "/getEmployee/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	String getEmployee(@PathVariable("id") long id) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		System.out.println("Fetching User with id " + id);
		List<Employee> employeeList = employeeService.searchEmployee(id, null);
		if (employeeList == null) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND)
					.toString();
		}
		return getJson(employeeList);
	}

/*********************** Create an Employee **************************************************/
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST,headers={"Accept=application/json", "Content-Type=application/json"})
	public @ResponseBody
	String addEmployee(@RequestBody Employee employee) {
		System.out.println("Creating User " + employee.getEmpName());
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		return employeeService.addEmployee(employee);
	}

/********************************** Update an Employee *****************************************************/
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public @ResponseBody String updateEmployee(@PathVariable("id") int id,
			@RequestBody Employee emp) {
		System.out.println("Updating employee " + id);
		EmployeeService employeeService = new EmployeeServiceImpl();
		//Employee employee = new Employee();
		employeeService.updateEmployee(id,emp);
		return "updated";
	}
	
/*******************************************************************************************************/
	private <T> String getJson(List<T> list) {
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonOutput = null;
		try {
			jsonOutput = objectMapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(list);

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(jsonOutput);
		return jsonOutput;
	}
}
