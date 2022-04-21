package com.example.imp;

import org.springframework.stereotype.Component;

import com.example.interfaces.TyresMain;

@Component("mTyre")
public class MichelinTyres implements TyresMain {

	public void rotate() {
		
		System.out.println("MichelinTyres are rotating in Vehicle");

	}

}
