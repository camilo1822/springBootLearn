package com.jucarbol.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Habilitar clientes feign en el proyecto, permite inyectar clientes en los
 * controladores
 */
@EnableFeignClients
@SpringBootApplication
public class SpringBootServicioItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServicioItemApplication.class, args);
	}

}
