//package com.vuelos.demo;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.hasItem;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.test.context.jdbc.Sql;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.vuelos.entity.Itinerario;
//import com.vuelos.entity.Pasajero;
//import com.vuelos.repository.IPasajeroRepo;
//import com.vuelos.entity.Aeropuerto;
//import com.vuelos.entity.Avion;
//import com.vuelos.entity.Compania;
//import com.vuelos.entity.DestinoOrigen;
//import com.vuelos.entity.Pasaje;
//import com.vuelos.entity.Vuelo;
//
//@ComponentScan(basePackages = {"com.vuelos"})
//@EnableJpaRepositories("com.vuelos.repository")
//@EntityScan("com.vuelos.entity")
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Sql({ "/schema.sql", "/data.sql" })
//class Data1ApplicationTests {
//	
////  Set<Itinerario> itinerarioSet = new HashSet<Itinerario>();
////  Set<Vuelo> vueloSet = new HashSet<Vuelo>();
////  Set<Avion> avionSet = new HashSet<Avion>();
////  Set<Pasaje> pasajeSet = new HashSet<Pasaje>();
////  
////  
////  DestinoOrigen destinoOrigen = new DestinoOrigen("Aeropuerto Internacional El Eden", "Armenia", "Aeropuerto Internacional Alfonso Bonilla Aragón","Cali", itinerarioSet);
////  
////  Itinerario itinerario = new Itinerario("2021-06-29 03:00:00", "2021-06-29 05:00:00", destinoOrigen, vueloSet); 
////  
////  //itinerarioSet.add(itinerario);
////  
////  Aeropuerto aeropuerto = new Aeropuerto("Aeropuerto Internacional El Eden", 2,"si", "Armenia", avionSet);
////  
////  Compania compania = new Compania ("Avianca", avionSet, vueloSet);
////  
////  
////  Avion avion = new Avion("ATR-72",74, aeropuerto, compania,vueloSet);
////
//////  avionSet.add(avion);
////  
//// 
////  Vuelo vuelo = new Vuelo (1, 100, "1",compania, itinerario, avion, pasajeSet);
////
////  
////  Pasajero pasajero = new Pasajero( 1,"Tatiana", "1010", "ts@gmail.com", "32181901", pasajeSet);   
////  Pasajero pasajero2 = new Pasajero( 2,"Tatiana", "222", "t@gmail.com", "32181", pasajeSet);   
////  
////  Pasaje pasaje = new Pasaje (1, "economica", "74",102.000f, pasajero, vuelo);
//////  pasajeSet.add(pasaje);
//	
//  @Autowired
//  IPasajeroRepo repositorio;
//  @Test
//  void elRepositorioExiste() {
//    assertNotNull(repositorio);
//  }
////  @Test
////  void buscarUno() {
////    Optional<Pasajero> pasajero3 = repositorio.findById(1);
////    if (pasajero3.isPresent()) {
////      assertEquals("1", pasajero3.get().getNombre());
////    }
////  }
////  @Test
////  void buscarTodos() {
////    List<Pasajero> pasajerosList = repositorio.findAll();
////   
////    assertThat(pasajerosList, hasItem(pasajero));
////    assertThat(pasajerosList, hasItem(pasajero2));
////  }
//    @Test
//    public void saveCustomer() {
//     
//        entityManager.persistAndFlush(pasajero);
//        assertThat(pasajero.getId()).isNotNull();
//    }
//    @Test
//    public void deleteCustomer() {
//        entityManager.persistAndFlush(pasajero);
//        entityManager.persistAndFlush(pasajero1);
//
//        repository.deleteAll();
//        assertThat(repository.findAll()).isEmpty();
//    }
//  
//  
//  
//}