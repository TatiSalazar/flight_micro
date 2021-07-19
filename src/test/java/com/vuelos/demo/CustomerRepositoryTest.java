//package com.vuelos.demo;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertThat;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.vuelos.entity.Aeropuerto;
//import com.vuelos.entity.Avion;
//import com.vuelos.entity.Compania;
//import com.vuelos.entity.DestinoOrigen;
//import com.vuelos.entity.Itinerario;
//import com.vuelos.entity.Pasaje;
//import com.vuelos.entity.Pasajero;
//import com.vuelos.entity.Vuelo;
//import com.vuelos.repository.IPasajeroRepo;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class CustomerRepositoryTest {
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    private IPasajeroRepo repository;
//    
//    public Set<Itinerario> itinerarioSet = new HashSet<Itinerario>();
//    Set<Vuelo> vueloSet = new HashSet<Vuelo>();
//    Set<Avion> avionSet = new HashSet<Avion>();
//    Set<Pasaje> pasajeSet = new HashSet<Pasaje>();
//    
//    
//    DestinoOrigen destinoOrigen = new DestinoOrigen("Aeropuerto Internacional El Eden", "Armenia", "Aeropuerto Internacional Alfonso Bonilla Aragón","Cali", itinerarioSet);
//    
//    Itinerario itinerario = new Itinerario("2021-06-29 03:00:00", "2021-06-29 05:00:00", destinoOrigen, vueloSet); 
//    
//    //itinerarioSet.add(itinerario);
//    
//    Aeropuerto aeropuerto = new Aeropuerto("Aeropuerto Internacional El Eden", 2,"si", "Armenia", avionSet);
//    
//    Compania compania = new Compania ("Avianca", avionSet, vueloSet);
//    
//    
//    Avion avion = new Avion("ATR-72",74, aeropuerto, compania,vueloSet);
//
////    avionSet.add(avion);
//    
//   
//    Vuelo vuelo = new Vuelo (1, 100, "1",compania, itinerario, avion, pasajeSet);
//  
//    
//    Pasajero pasajero = new Pasajero( 1,"Tatiana", "1010", "ts@gmail.com", "32181901", pasajeSet);   
//    Pasajero pasajero1 = new Pasajero( 2,"Tatiana", "222", "t@gmail.com", "32181", pasajeSet);   
//    
//    Pasaje pasaje = new Pasaje (1, "economica", "74",102.000f, pasajero, vuelo);
////    pasajeSet.add(pasaje);
//    
//    
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
//}