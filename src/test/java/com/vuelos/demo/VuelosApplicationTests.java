package com.vuelos.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import com.vuelos.controller.DemoController;
import com.vuelos.entity.Pasajero;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = VuelosApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class VuelosApplicationTests {
	
	@Autowired
	 private DemoController controller;

	 @Test
	 public void contextLoads() {
	  assertThat(controller).isNotNull();
	 }
	 @Autowired
		private TestRestTemplate restTemplate;

		@LocalServerPort
		private int port = 5432;

		private String getRootUrl() {
			return "http://localhost:" + port;
		}
		
		@Test
		public void testCreatePasajeros() {
			Pasajero pasajero = new Pasajero();
			pasajero.setEmail("tati@gmail.com");
			pasajero.setTelefono("11111");
			pasajero.setDocumento("123");
			pasajero.setNombre("tatiana");
			pasajero.setId(1);
			
		
			

			ResponseEntity<Pasajero> postResponse = restTemplate.postForEntity(getRootUrl() + "/pasajeros", pasajero, Pasajero.class);
			assertNotNull(postResponse);
			assertNotNull(postResponse.getBody());
		}

		@Test
		public void testGetAllPasajeros() {
			HttpHeaders headers = new HttpHeaders();
			HttpEntity<String> entity = new HttpEntity<String>(null, headers);

			ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/pasajeros",
					HttpMethod.GET, entity, String.class);
			
			assertNotNull(response.getBody());
		}

		@Test
		public void testGetPasajerosById() {
			int id = 2;
			
			try {
				Pasajero pasajero1 = restTemplate.getForObject(getRootUrl() + "/pasajeros/"+id, Pasajero.class);
				//System.out.println(pasajero.getNombre());
				assertNotNull(pasajero1);
			} catch (final HttpClientErrorException e) {
				assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
			}
		}



		@Test
		public void testUpdatePasajero() {
			int id = 1;
			Pasajero pasajero = restTemplate.getForObject(getRootUrl() + "/pasajeros/modificar/" + id, Pasajero.class);
			pasajero.setNombre("tatiana");

			restTemplate.put(getRootUrl() + "/pasajeros/modificar/" + id, pasajero);

			Pasajero updatedPasajero = restTemplate.getForObject(getRootUrl() + "/pasajeros/modificar/" + id, Pasajero.class);
			assertNotNull(updatedPasajero);
		}

		@Test
		public void testDeletePasajero() {
			int id = 1;
			Pasajero pasajero = restTemplate.getForObject(getRootUrl() + "/pasajeros/delete/" + id, Pasajero.class);
			assertNotNull(pasajero);

			restTemplate.delete(getRootUrl() + "/pasajeros/delete/" + id);

			try {
				pasajero = restTemplate.getForObject(getRootUrl() + "/pasajeros/delete/" + id, Pasajero.class);
			} catch (final HttpClientErrorException e) {
				assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
			}
		}

}
