//package com.vuelos.demo;
//
//import java.util.Properties;
//import javax.sql.DataSource;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@SpringBootApplication
//@EnableJpaRepositories("com.vuelos.repository")
//@EnableTransactionManagement
//public class Data1Application {
//	public static void main(String[] args) {
//		SpringApplication.run(Data1Application.class, args);
//	}
//
//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:postgresql://localhost:5432/vueloDemo");
//		dataSource.setUsername("postgres");
//		dataSource.setPassword("amelia");
//		return dataSource;
//	}
//
//	@Bean
//	LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//
//		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//		entityManagerFactoryBean.setDataSource(dataSource);
//		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//		entityManagerFactoryBean.setPackagesToScan("com.vuelos.repository");
//
//		Properties jpaProperties = new Properties();
//
//		jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//
//		entityManagerFactoryBean.setJpaProperties(jpaProperties);
//
//		return entityManagerFactoryBean;
//
//	}
//
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//
//		JpaTransactionManager txManager = new JpaTransactionManager();
//		txManager.setEntityManagerFactory(entityManagerFactory(dataSource()).getObject());
//		return txManager;
//
//	}
//
//}
