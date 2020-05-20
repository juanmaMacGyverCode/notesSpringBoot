package com.proyecto.notas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunProyectoNotasApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunProyectoNotasApplication.class, args);
	}

	/*@Override
	public void run(String...args) throws Exception {
		repositorio.findAll().forEach((p) - > System.out.println(p.getNombre()));
	}*/
}
