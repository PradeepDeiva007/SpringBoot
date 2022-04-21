package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.config.VehicleConfig2;

public class VehicleMain2 {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfig2.class);
		Person person = context.getBean(Person.class);
		System.out.println("Person Name :"+ person.getName());
		person.getVehicle().started();
		
		person.getVehicle().getVechileService().playMusic();
		person.getVehicle().getVechileService().moveVehicle();
		
		context.close();
		

	}

}
