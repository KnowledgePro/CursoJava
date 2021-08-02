package com.afp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.println("Bienvenido al Sistema de gestión AFP Zukunft");
		System.out.print("Ingrese su nombre: ");
		String name = lector.nextLine();
		System.out.print("Ingrese su edad: ");
		int age = lector.nextInt();
		System.out.print("Ingrese sus semanas cotizadas: ");
		int weeks = lector.nextInt();
		System.out.print("Ingrese su sexo ('Hombre'/'Mujer'): ");
		Gender sex = Gender.valueOf(lector.next().toUpperCase());
		Persona user1 = new Persona(name, age, weeks, sex);
		lector.close();
		System.out.println("Un usuario de " + user1.edad + " años,");
		System.out.print(user1.sexo);
		System.out.println(", que tenga " + user1.semanasCotizadas + " semanas cotizadas");
		poderPensionarse(user1);
	}
	
	public static void poderPensionarse(Persona user) {
		int edadRetiro;
		switch (user.sexo) {
			case MUJER: {
				edadRetiro = 57;
				break;
			}
		default:
			edadRetiro = 62;
			break;
		}
		if (user.edad >= edadRetiro && user.semanasCotizadas >= 1200){
			System.out.println("SI se puede pensionar");
		} else {
			System.out.println("NO se puede pensionar");
		}
		
		
		
	}

}
