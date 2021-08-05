package com.misiontic.main;

public class Main {

	public static void main(String[] args) {
		/**
		 * @param weight
		 * @param happiness
		 * @param hunger
		 * @param sleep
		 */
		Animal perrito = new Animal(60, 50, 50, 0);
		
		Animal gatico = new Animal(50, 50, 50, 0);
		Food apple = new Food("Manzana", 10);
		apple.goToSleep(); // ¿¿Y ahí qué hacemos???
		System.out.println("hambre perrito: " + perrito.getHunger());
		System.out.println("hambre gatico: " + gatico.getHunger());
		
		System.out.println("felicidad perrito: " + perrito.getHappiness());
		System.out.println("felicidad gatico: " + gatico.getHappiness());

	}

}
