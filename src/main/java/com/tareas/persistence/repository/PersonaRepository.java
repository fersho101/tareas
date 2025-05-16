package com.tareas.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tareas.persistence.entities.Persona;

public interface PersonaRepository extends JpaRepository<Persona, String> {
	
	Persona findByNombre(String nombre);

}
