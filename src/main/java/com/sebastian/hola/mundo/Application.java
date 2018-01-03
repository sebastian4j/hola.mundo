package com.sebastian.hola.mundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hola")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@GetMapping(value = "/{nombre}/{apellido}")
	public String hola(@PathVariable("nombre") String nombre,
	        @PathVariable("apellido") String apellido) {
	    return String.format("{\"mensaje\":\"hola %s %s\"}", nombre, apellido);	    
	}
}
