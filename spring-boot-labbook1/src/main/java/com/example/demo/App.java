package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
       	
        Sbu sbu=(Sbu) context.getBean("sbu");
        sbu.display();
        
        Employee emp = (Employee) context.getBean("EMP");
		emp.display();
        
	}

}
