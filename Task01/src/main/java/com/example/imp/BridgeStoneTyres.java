package com.example.imp;

import org.springframework.stereotype.Component;

import com.example.interfaces.TyresMain;

@Component("bTyre")
public class BridgeStoneTyres implements TyresMain {

	public void rotate() {
		
		System.out.println("BridgeStoneTyres are rotating in Vehicle");

	}

}
