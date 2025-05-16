package com.tareas.services;

import java.util.List;

import com.tareas.persistence.entities.Persona;

public interface PersonaService {
	
	public Persona addPersona(Persona persona);

	public List<Persona> getPersonas();
	
	public Persona updatePersona(Persona persona);
	
	public Persona deletePersona(String nombre);
	
}
