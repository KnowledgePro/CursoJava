package com.misiontic2022.funciones;

public class FuncAritmeticas {

	public static double cuadrado(double a) {
		double resultado = multiplicar(a, a);
		return resultado;
		
	}
	
	public static double exponente(double base, double expo) {
		double resultado = Math.pow(base, expo);
		return resultado;
	}
	
	public static double multiplicar(double a, double b) {
		double resultado = a * b;
		return resultado;
	}

	public static int divEntera(double a, double b) {
		double resultadoDouble = Main.dividir(a, b);
		int resultado = (int)resultadoDouble;
		return resultado;
	}
}
