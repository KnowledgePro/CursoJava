package com.misiontic.main;

import java.awt.Color;

public class Animal {
	int legNumber = 4;
	Color furColor;
	protected float weight;
	protected int happiness;//va de 0 a 100, 0 es triste; 100 es feliz.
	protected int health;//va de 0 a 100, 0 muerto, 100 muy saludable.
	protected int hunger;//va de 100 a 0, 100 es famélico y 0 es muy lleno.
	protected int sleep; // 0 muy despierto - 100 profundamente dormido
	boolean awake; //true despierto - false dormido
	
	//Tengo que dar una respuesta cuando termine de comer?
	//Yo quiero decir si ya termine de comer
	protected void eat(Food meal) {
		if (awake) {
			hunger -= meal.hunger;
			sleep += meal.sleep;
			health += meal.health;
			weight += meal.weight;
			happiness += meal.happiness;
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
		System.out.println("¡Qué sueño tan rico!");
		
	}
	protected void takeMedicine(Medicine drug) {
		hunger -= drug.hunger;
		sleep += drug.sleep;
		health += drug.health;
		weight += drug.weight;
		happiness -= drug.happiness;
		if (drug.energy > 5) {
			sleep -= 2 * drug.energy; 
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
			System.out.println("Estoy dormido ahora");
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
