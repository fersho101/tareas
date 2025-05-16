package com.tareas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareas.persistence.entities.Persona;
import com.tareas.persistence.repository.PersonaRepository;

@Service
public class PersonaserviceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public Persona addPersona(Persona persona) {
		return personaRepository.save(persona);
	}

	@Override
	public List<Persona> getPersonas() {
		return personaRepository.findAll();

	}

	@Override
	public Persona updatePersona(Persona persona) {
		Persona p = personaRepository.findByNombre(persona.getNombre());
		if(p != null) {
			p.setEdad(persona.getEdad());
			return personaRepository.save(p);
		} else {
			return null;			
		}
	}

	@Override
	public Persona deletePersona(String nombre) {
		Persona p = personaRepository.findByNombre(nombre);
		personaRepository.delete(p);
		return p;
	}

}
