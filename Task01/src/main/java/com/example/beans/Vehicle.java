package com.example.beans;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.service.VehicleService;

@Component
public class Vehicle {
	
	public void started() {
		System.out.println("Vehicle Status Started");
	}
	
	@PreDestroy
	public void detroy() {
		System.out.println("Vehicle Status Stopped");
	}

	/*
	  @Autowired private VehicleServices vechileServices;
	 
	
	
	  public VehicleServices getVechileServices() { return vechileServices; }
	  
	  public void setVechileServices(VehicleServices vechileServices) {
	  this.vechileServices = vechileServices; }
	 */
	
	@Autowired 
	private VehicleService vechileService;

	public VehicleService getVechileService() {
		return vechileService;
	}

	public void setVechileService(VehicleService vechileService) {
		this.vechileService = vechileService;
	}
	
	

	
	
	
	

	

	
}
