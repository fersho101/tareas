package com.tareas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tareas.persistence.entities.Persona;
import com.tareas.services.HolaMundoService;

@RestController
@RequestMapping("/pruebas")
public class HolaMundoRestController {

	@Autowired
	private HolaMundoService service;

	@GetMapping("/saludos")
	public String saludo() {
		System.out.println("Ejecutando endpoint /hola");
		return "Hola mundo. Bienvenido a Spring Boot";
	}

	@GetMapping("/mayoresEdad")
	public int mayoresEdad() {
		return service.mayoresEdad();
	}

	@GetMapping("/parametros")
	public String parametros1(@RequestParam String parametro) {

		return "Recibiendo query param con valor: " + parametro;
	}

	@GetMapping("/parametros/{parametro}")
	public String parametros2(@PathVariable String parametro) {

		return "Recibiendo path variable con valor: " + parametro;
	}

	@PostMapping("/parametros")
	public String pamametros3(@RequestBody Persona persona) {
		return "recibiendo request body con valor: " + persona.getNombre();
	}

}
