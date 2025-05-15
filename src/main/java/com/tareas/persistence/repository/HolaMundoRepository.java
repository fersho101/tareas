package com.tareas.persistence.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tareas.persistence.entities.Persona;

@Repository
public class HolaMundoRepository {

	List<Persona> personas = new ArrayList<Persona>(
			Arrays.asList(new Persona("pepe", 49), new Persona("manuel", 30), new Persona("juan", 12)));

	public List<Persona> getPersonas() {
		return personas;
	}

}
