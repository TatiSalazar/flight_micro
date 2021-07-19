package com.vuelos.demo;


import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import java.sql.DriverManager;


@SpringBootApplication
@ComponentScan(basePackages = {"com.vuelos"})
@EnableJpaRepositories("com.vuelos.repository")
@EntityScan("com.vuelos.entity")
//@EnableTransactionManagement
public class VuelosApplication implements CommandLineRunner {



//	public static void main(String[] args) {
//		SpringApplication.run(VuelosApplication.class, args);
//	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Desde Consola");
		
	}
	
	 public static void main(String[] args) {
		    SpringApplication.run(VuelosApplication.class, args);
		    VuelosApplication javaPostgreSQLBasic = new VuelosApplication();
	        javaPostgreSQLBasic.connectDatabase(); 
		  }
		  
//		    @Bean
//		    public DataSource dataSource() {
//		        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		        dataSource.setDriverClassName("org.postgresql.Driver");
//		        dataSource.setUrl("jdbc:postgresql://localhost:5432/vueloDemo");
//		        dataSource.setUsername("postgres");
//		        dataSource.setPassword("amelia");
//		        return dataSource;
//		    }
//		 
//		    @Bean
//		    LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//		 
//		        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//		        entityManagerFactoryBean.setDataSource(dataSource);
//		        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//		        entityManagerFactoryBean.setPackagesToScan("com.vuelos.repository");
//		 
//		        Properties jpaProperties = new Properties();
//		 
//		        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
//		 
//		        entityManagerFactoryBean.setJpaProperties(jpaProperties);
//		 
//		        return entityManagerFactoryBean;
//		         
//		    }
//		     
//		    @Bean public PlatformTransactionManager transactionManager() {
//		         
//		        JpaTransactionManager txManager= new JpaTransactionManager();
//		        txManager.setEntityManagerFactory(entityManagerFactory(dataSource()).getObject());
//		        return txManager;
//		         
//		    }
		    
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
