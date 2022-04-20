package com.example.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Animal {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("Welcome to @Component annotation service");
	}
	
	@PostConstruct
	public void initialize() {
		this.name = "Tiger";
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Detroy method will call if any Context,IO,Database connection etc.. closed");
	}
	
}
