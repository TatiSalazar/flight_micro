package com.vuelos.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.vuelos.service.IPasajeroService;



@SpringBootApplication
@ComponentScan(basePackages = {"com.vuelos"})
@EnableJpaRepositories("com.vuelos.repository")
@EntityScan("com.vuelos.entity")
public class VuelosApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(VuelosApplication.class);

//	@Autowired
//	private IPasajeroService service;

	public static void main(String[] args) {
		SpringApplication.run(VuelosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Desde Consola");
		
	}

//	@Override
//	public void run(String... args) throws Exception {
////		System.out.println("Hola Desde Consola");
////		LOG.info("Hola");
////		LOG.warn("advertencia");
//
//		service.registrar("VuelosCode");
//	}
}
