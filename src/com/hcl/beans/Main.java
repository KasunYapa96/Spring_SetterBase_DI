package com.hcl.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
		Employee em=(Employee)ac.getBean("emp1");
		
		System.out.println(em);
		
		
	}
	
}
