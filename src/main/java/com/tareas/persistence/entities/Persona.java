package com.tareas.persistence.entities;

//import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="persona")
public class Persona {
	
	@Id
	private String nombre;
	private int edad;
	/*
	 * @Value("${spring.application.valor}") private String valor;
	 */

	public Persona() {
		super();
	}

//	public String getValor() {
//		return valor;
//	}
//
//	public void setValor(String valor) {
//		this.valor = valor;
//	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
