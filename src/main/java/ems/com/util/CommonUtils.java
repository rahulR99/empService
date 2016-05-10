package ems.com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ems.com.dao.EmployeeDao;
import ems.com.dao.EmployeeDaoImpl;

public class CommonUtils {
	static ApplicationContext context;
	static EmployeeDao dao;
	
	static{
		context =  new ClassPathXmlApplicationContext("beansJDBC.xml");	
		}
	
	public static EmployeeDao getDaoObject(){
		 return dao = (EmployeeDaoImpl)context.getBean("employeeDaoImpl");
	}
}
