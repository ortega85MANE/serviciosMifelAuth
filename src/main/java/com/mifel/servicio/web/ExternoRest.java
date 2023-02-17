package com.mifel.servicio.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/rest/externoData")
public class ExternoRest {

	@Autowired
    private RestTemplate consumerExterno;
	
	@GetMapping
    public ResponseEntity<Object> obtenerAlumnos() {
		try {
	    	String url = "https://pokeapi.co/api/v2/pokemon/ditto";
	        HttpHeaders headers = new HttpHeaders();
	        headers.setContentType(MediaType.APPLICATION_JSON);
	        HttpEntity<Object> entity = new HttpEntity<>(headers);
	        ResponseEntity<Object> response = consumerExterno.exchange(url + "?detailsLevel=FULL", HttpMethod.GET, entity,
	                Object.class);
	        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    } 
   
}
