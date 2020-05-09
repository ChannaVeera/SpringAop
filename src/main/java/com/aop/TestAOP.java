package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.config.ConfigurationClasss;

/*
 * 
 */

public class TestAOP {
	
	public static void main(String[] args) {
		
		

     //   ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClasss.class);
        EmployeeManager manager = context.getBean(EmployeeManager.class);
 
       
       EmployeeDTO employee= manager.createEmployee(new EmployeeDTO());
      
       
		manager.updateEmployee(employee);
        manager.getEmployeeById(1);
        manager.deleteEmployee(1);
       
	}

}
