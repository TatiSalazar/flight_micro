package com.vuelos.demo;


import java.sql.Connection;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.sql.DriverManager;


@SpringBootApplication
@ComponentScan(basePackages = {"com.vuelos"})
@EnableJpaRepositories("com.vuelos.repository")
@EntityScan("com.vuelos.entity")
//@EnableTransactionManagement
public class VuelosApplication implements CommandLineRunner {


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Desde Consola");
		
	}
	
	 public static void main(String[] args) {
		    SpringApplication.run(VuelosApplication.class, args);
		    VuelosApplication javaPostgreSQLBasic = new VuelosApplication();
	        javaPostgreSQLBasic.connectDatabase(); 
		  }
		    
		    //---------
		    public void connectDatabase() {
		        try {
		            // We register the PostgreSQL driver
		            // Registramos el driver de PostgresSQL
		            try { 
		                Class.forName("org.postgresql.Driver");
		            } catch (ClassNotFoundException ex) {
		                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
		            }
		            Connection connection = null;
		            // Database connect
		            // Conectamos con la base de datos
		            connection = DriverManager.getConnection(
		                    "jdbc:postgresql://localhost:5432/vueloDemo",
		                    "postgres", "amelia");
		 
		            boolean valid = connection.isValid(50000);
		            System.out.println(valid ? "TEST OK" : "TEST FAIL");
		        } catch (java.sql.SQLException sqle) {
		            System.out.println("Error: " + sqle);
		        }
		    } 

}
