package com.misiontic.main;

public class Food extends Animal{
	

	private String name;
	private int energy;
	
	

	public String getName() {
		return name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public Food(String name, int energy) {
		/**
		 * @param weight
		 * @param happiness
		 * @param hunger
		 * @param sleep
		 */
		super(5, 5, 5, 5);
		this.name = name;
		this.energy = energy;
		
		// TODO Auto-generated constructor stub
	}
	
}
