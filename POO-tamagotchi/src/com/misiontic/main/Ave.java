package com.misiontic.main;

public class Ave extends Animal {
	private int wingSpan;
	
	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}

	/**
	 * @param weight
	 * @param happiness
	 * @param hunger
	 * @param sleep
	 */
	
	public Ave(int wingSpan, int weight, int happiness, int hunger, int sleep) {
		super(weight, happiness, hunger, sleep);
		this.wingSpan = wingSpan;
		// TODO Auto-generated constructor stub
	}

}
