package com.tareas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareas.persistence.entities.Persona;
import com.tareas.persistence.repository.HolaMundoRepository;

@Service
public class HolaMundoServiceImpl implements HolaMundoService {

	@Autowired
	HolaMundoRepository repository;

	public int mayoresEdad() {
		List<Persona> personas = repository.getPersonas();
		int contador = 0;
		for (Persona p : personas) {
			if (p.getEdad() > 18) {
				contador++;
			}
		}
		return contador;
	}
	
//	public String getValor() {
//		List<Persona> personas = repository.getPersonas();
//		return personas.get(0).getValor();
//	}

}
