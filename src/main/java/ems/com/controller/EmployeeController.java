package ems.com.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ems.com.model.Employee;
import ems.com.service.EmployeeService;
import ems.com.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	     
/*	    @Autowired
	    private EmployeeService employeeService;
	     */
	   /* @RequestMapping(value="/addEmployee", method=RequestMethod.POST,produces = {"text/plain", "application/*"})
	    @ResponseBody
	    public String addEmployee(@RequestBody Employee employee) {
	        System.out.println("name-----"+employee.getEmpName());
	        return "success";
	    }*/
	     
	    @RequestMapping("/hello")
	    @ResponseBody
	    public String hellog(){
	    	return "hello Rahul";
	    }
	    
	    @RequestMapping(value="/list",produces="application/json",method=RequestMethod.GET)
	    public  @ResponseBody String getAllEmployee(){
	    	EmployeeService employeeService =new EmployeeServiceImpl();
	    	List<Employee> employeeList=null;
	    			if((employeeList= employeeService.getAllEmployee() )!=null){
	    				
	    				System.out.println("get successfully though");
	    			}
	    			ObjectMapper objectMapper = new ObjectMapper();
	    			//ImmunizationDao immunizationDao1 = new ImmunizationDaoImpl();
	    			String jsonOutput = null;
					try {
						jsonOutput = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employeeList);
					
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
	    			System.out.println(jsonOutput);
	    	return jsonOutput;
	    }
	 /*   @RequestMapping(value="/create", method=RequestMethod.POST, 
	            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	    @ResponseBody
	    public Employee updateEmployee(@RequestBody Employee employee) {
	        return null;
	    }
	     */
	   
}
