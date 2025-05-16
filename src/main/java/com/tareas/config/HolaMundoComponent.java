package com.tareas.config;

import org.springframework.stereotype.Component;

@Component
public class HolaMundoComponent {
	int numero;

	public HolaMundoComponent() {
		super();
		this.numero = (int) (Math.round(Math.random() * 10));
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
