package com.misiontic.main;

public class Veterinary {
	String name;
	
	Medicine prescribeMedicine(Animal pet) {
		Medicine prescription = new Medicine(name, 0, 0);
		if (pet.getHealth() < 20) {
			prescription.setHealth(50);
			
			// TODO Define medicines to implement veterinary logic 
		}
		return prescription;
	}
}
