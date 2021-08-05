package com.misiontic.main;

public class Medicine extends Food {
	protected int protection;
	
	public int getProtection() {
		return protection;
	}
	public void setProtection(int protection) {
		this.protection = protection;
	}
	/**
	 * @param name
	 * @param energy
	 * @param protection
	 */
	public Medicine(String name, int energy, int protection) {
		super(name, energy);
		this.protection = protection;
	}
	
	
	
	
}
