package com.example.main;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Example {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Vehicle v = context.getBean(Vehicle.class);
		System.out.println(v.getName());
		
		Person p = context.getBean(Person.class);
		System.out.println(p.getPersonName());
		System.out.println(p.getVehicle().getName());
		
		/* 
		Vehicle v1 = context.getBean("TVS",Vehicle.class);
		System.out.println(v1.getName());
		
		Vehicle v2 = context.getBean("Honda",Vehicle.class);
		System.out.println(v2.getName());
		
		Vehicle v3 = context.getBean("YAMAHA",Vehicle.class);
		System.out.println(v3.getName());
		*/
		
		System.out.println(context.getBean(String.class));

	}

}
