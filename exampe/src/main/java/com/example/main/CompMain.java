package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Animal;
import com.example.config.CompConfig;

public class CompMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CompConfig.class);
		Animal animal = context.getBean(Animal.class);
		System.out.println(animal.getName());
		animal.print();
		System.out.println(context.getBean(String.class));
		context.close();
	}

}
