package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Manager;
import com.example.config.AutoWiredConfig;

public class AutoWiredMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoWiredConfig.class);
		
		Manager mag = context.getBean(Manager.class);
		System.out.println(mag.getVechile().getName());
		
	}

}
