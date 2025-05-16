package com.tareas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tareas.config.ClasePrueba;
import com.tareas.config.HolaMundoComponent;
import com.tareas.config.PropsComponent;
import com.tareas.persistence.entities.Persona;
import com.tareas.services.HolaMundoService;

@RestController
@RequestMapping("/pruebas")
public class HolaMundoRestController {

	@Autowired
	private HolaMundoService service;

	@Autowired
	private HolaMundoComponent componente;

	@Autowired
	private PropsComponent props;

	@Autowired
	private ClasePrueba clasePrueba;

	@GetMapping("/saludos")
	public ResponseEntity<String> saludo() {
		System.out.println("Ejecutando endpoint /hola");
		String s = "Hola mundo. Bienvenido a Spring Boot";
		return ResponseEntity.ok(s);
	}

	@GetMapping("/mayoresEdad")
	public ResponseEntity<Integer> mayoresEdad() {
		Integer i = service.mayoresEdad();
		return ResponseEntity.ok(i);
	}

	@GetMapping("/parametros")
	public ResponseEntity<String> parametros1(@RequestParam String parametro) {
		String s = "Recibiendo query param con valor: " + parametro;
		return ResponseEntity.ok(s);
	}

	@GetMapping("/parametros/{parametro}")
	public ResponseEntity<String> parametros2(@PathVariable String parametro) {
		String s = "Recibiendo path variable con valor: " + parametro;
		return ResponseEntity.ok(s);
	}

	@PostMapping("/parametros")
	public ResponseEntity<String> pamametros3(@RequestBody Persona persona) {
		String s = "recibiendo request body con valor: " + persona.getNombre();
		return ResponseEntity.ok(s);
	}

//	@GetMapping("propiedades")
//	public ResponseEntity<String> propiedades() {
//		String s = service.getValor();
//		return ResponseEntity.ok(s);
//	}

	@GetMapping("componentes")
	public ResponseEntity<Integer> componentes() {
		Integer i = componente.getNumero();
		return ResponseEntity.ok(i);
	}

	@GetMapping("props")
	public ResponseEntity<String> getProps() {
		String valor1 = props.getValor1();
		String valor2 = props.getValor2();
		String s = "Valor 1 = " + valor1 + " Valor 2 = " + valor2;
		return ResponseEntity.ok(s);
	}

	@GetMapping("beans")
	public ResponseEntity<String> beans() {
		String s = clasePrueba.getNombre();
		return ResponseEntity.ok(s);
	}
}
