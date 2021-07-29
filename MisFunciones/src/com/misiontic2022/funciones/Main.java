package com.misiontic2022.funciones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.println("Operando a:");
		double a = lector.nextDouble();
		System.out.println("Operando b:");
		double b = lector.nextDouble();
		System.out.println("a/b: " + dividir(a,b));
		System.out.println("a//b: " + FuncAritmeticas.divEntera(a, b));
		System.out.println("a^2: " + FuncAritmeticas.cuadrado(a));
		System.out.println("a^b: " + FuncAritmeticas.exponente(a, b));
		lector.close();
		
	}
	
	public static double dividir(double a, double b){
		if (b != 0) {
			double resultado = a/b;
			return resultado;
		} else {
			System.out.println("¡División por cero!");
			return 0;
			}
		}
}
