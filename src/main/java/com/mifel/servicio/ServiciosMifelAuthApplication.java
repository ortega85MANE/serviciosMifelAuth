package com.mifel.servicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiciosMifelAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiciosMifelAuthApplication.class, args);
	}

    @Bean
    public RestTemplate restTemplate() throws Exception {
        return new RestTemplate();
    }
}
