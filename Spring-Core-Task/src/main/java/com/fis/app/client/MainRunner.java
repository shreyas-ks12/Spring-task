package com.fis.app.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app.model.ElectronicDevices;

	public class MainRunner {

		public static void main(String[] args) {
			 
			ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
			ElectronicDevices ed = (ElectronicDevices)spring.getBean("electronicDevices");
		
			System.out.println(ed);
			
		
		}
		
	}
	
	