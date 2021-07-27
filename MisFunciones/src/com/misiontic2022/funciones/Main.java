package com.misiontic2022.funciones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.println("Operando a:");
		float a = lector.nextFloat();
		System.out.println("Operando b:");
		float b = lector.nextFloat();
		System.out.println("a/b: " + dividir(a,b));
		System.out.println("a^2: " + Aritmeticas.cuadrado(a));
		
	}
	
	public static float dividir(float a, float b){
		if (b != 0) {
			float resultado = a/b;
			return resultado;
		} else {
			System.out.println("¡División por cero!");
			return 0;
			}
		}
}
