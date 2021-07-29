package com.misiontic.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//Salida de datos
		/*
		System.out.println("Hello world"); //Tiene salto de linea
		System.out.print("Hola mundo"); //No tiene salto de linea
		System.out.print("Hola 2");
		
		
		//Entrada de datos
		Scanner scanner = new Scanner(System.in); //Se crea el lector

        System.out.println("Por favor ingrese su nombre");//Se pide un dato al usuario

        String nombre = scanner.nextLine(); //Se lee el nombre con nextLine() que retorna un String con el dato

        System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");//Se pide otro dato al usuario
        
        int edad = scanner.nextInt(); //Se guarda la edad directamente con nextInt()

        //N�tese que ya no hubo necesidad de usar parseInt() pues nextInt nos retorna un entero derectamente

        System.out.println("Gracias " + nombre + " en 10 a�os usted tendr� " + (edad + 10) + " a�os."); //Operacion numerica con la edad
       
		*/
		//Segunda opcion lectura de datos
		//Notar que readLine() nos obliga a declarar IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"

        System.out.println("Por favor ingrese su nombre");//Se pide un dato al usuario

        String nombre = br.readLine(); //Se lee el nombre con readLine() que retorna un String con el dato

        System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");//Se pide otro dato al usuario
        
        String entrada = br.readLine(); //Se guarda la entrada (edad) en una variable

        //N�tese que readLine siempre retorna String y la clase BufferedReader...
        //no tiene un m�todo para leer enteros, as� que debemos convertirlo.

        int edad = Integer.parseInt(entrada);//Se transforma la entrada anterior en un entero
        //Si el usuario ingres� solo n�meros funcionar� bien, de lo contrario generar� una excepci�n

        System.out.println("Gracias " + nombre + " en 10 a�os usted tendr� " + (edad + 10) + " a�os."); //Operacion numerica con la edad
	}

}
