package com.misiontic.main;

import java.awt.Color;

public class Animal {
	private int legNumber = 4;
	private Color furColor;
	private float weight;
	private int happiness;//va de 0 a 100, 0 es triste; 100 es feliz.
	private int health;//va de 0 a 100, 0 muerto, 100 muy saludable.
	private int hunger;//va de 100 a 0, 100 es famélico y 0 es muy lleno.
	private int sleep; // 0 muy despierto - 100 profundamente dormido
	boolean awake; //true despierto - false dormido


	public int getLegNumber() {
		return legNumber;
	}

	public Color getFurColor() {
		return furColor;
	}

	public float getWeight() {
		return weight;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getHealth() {
		return health;
	}

	public int getHunger() {
		return hunger;
	}

	public int getSleep() {
		return sleep;
	}

	public boolean isAwake() {
		return awake;
	}

	public void setLegNumber(int legNumber) {
		 this.legNumber = legNumber;
	}

	public void setFurColor(Color furColor) {
		this.furColor = furColor;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

	public void setAwake(boolean awake) {
		this.awake = awake;
	}

	
	/**
	 * @param weight
	 * @param happiness
	 * @param hunger
	 * @param sleep
	 */
	public Animal(float weight, int happiness, int hunger, int sleep) {
		this(Color.white, weight, happiness, 100, hunger, sleep);
		this.weight = weight;
		this.happiness = happiness;
//		this.health = health;
		this.hunger = hunger;
		this.sleep = sleep;
	}
	
	/**
	 * @param furColor
	 * @param weight
	 * @param happiness
	 * @param health
	 * @param hunger
	 * @param sleep
	 */
	public Animal(Color furColor, float weight, int happiness, int health, int hunger, int sleep) {
		this.furColor = furColor;
		this.weight = weight;
		this.happiness = happiness;
		this.health = health;
		this.hunger = hunger;
		this.sleep = sleep;
	}

	

	//Tengo que dar una respuesta cuando termine de comer?
	//Yo quiero decir si ya termine de comer
	protected void eat(Food meal) {
		if (awake) {
			hunger -= meal.getHunger();
			sleep += meal.getSleep();
			health += meal.getHealth();
			weight += meal.getWeight();
			happiness += meal.getHappiness();
			System.out.println("¡Qué comida tan rica!");
		} else {
			System.out.println("ZZZZZZ - Estoy durmiendo");
		}
	}


	protected void goToSleep() {
		awake = false;
		hunger -= 1;
		sleep = 0;
		health += 1;
		// weight += 2;
		happiness += 1;
		System.out.println("Estoy Durmiendo - ZZZZZZ");

	}
	protected void takeMedicine(Medicine drug) {
		hunger -= drug.getHunger();
		sleep += drug.getSleep();
		health += drug.getHealth();
		weight += drug.getWeight();
		happiness -= drug.getHappiness();
		if (drug.getEnergy() > 5) {
			sleep -= 2 * drug.getEnergy();
		}
	}
	private void excercise() {

	}
	private void play() {

	}
	private void awaken() {
		awake = true;
	}
	private void pooPee() {

	}
	protected void checkStatus() {
		if(hunger < 0) {
			hunger = 0;
			System.out.println("Estoy demasiado lleno, me voy a enfermar de tanto comer");
			health -= 2;
		}
		if(sleep > 100) {
			sleep = 100;
			awake = false;
			System.out.println("Me quedé dormido");
		}
		if(health < 10) {
			sleep +=10;
			System.out.println("Llévame al veterinario, estoy muy enfermo");
		}
		if(weight < 10) {
			System.out.println("Estoy demasiado flaco, necesito comer");
			health = health -2;
		}
		if(happiness < 0) {
			happiness = 0;
			System.out.println("Estoy demasiado triste, no quiero hacer nada");
			health = health -2;
		}

	}
}
