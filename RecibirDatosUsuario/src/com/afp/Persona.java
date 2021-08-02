package com.afp;

public class Persona {
	protected String nombre;
	protected int edad;
	protected int semanasCotizadas;
	protected Gender sexo;

	public Persona(String name, int age, int weeks, Gender sex) {
		this.nombre = name;
		this.edad = age;
		this.semanasCotizadas = weeks;
		this.sexo = sex;
	}
	
}
