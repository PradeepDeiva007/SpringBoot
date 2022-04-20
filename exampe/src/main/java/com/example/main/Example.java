package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Example {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Vehicle v = context.getBean(Vehicle.class);
		System.out.println(v.getName());
		
		/* 
		Vehicle v1 = context.getBean("TVS",Vehicle.class);
		System.out.println(v1.getName());
		
		Vehicle v2 = context.getBean("Honda",Vehicle.class);
		System.out.println(v2.getName());
		
		Vehicle v3 = context.getBean("YAMAHA",Vehicle.class);
		System.out.println(v3.getName());
		*/
		
		System.out.println(context.getBean(String.class));

		System.out.println(context.getBean(Integer.class));
	}

}
