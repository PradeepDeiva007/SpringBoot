package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	
	private Vehicle vechile;
	
	@Autowired
	public Manager(@Qualifier("v2") Vehicle v) {
		
		System.out.println("Manager Bean Created");
		this.vechile = v;
	}

	public Vehicle getVechile() {
		return vechile;
	}

	public void setVechile(Vehicle vechile) {
		this.vechile = vechile;
	}
	
	

}
