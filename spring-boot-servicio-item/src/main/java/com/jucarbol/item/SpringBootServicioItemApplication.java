package com.jucarbol.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableFeignClients Habilitar clientes feign en el proyecto, permite inyectar
 *                     clientes en los controladores
 * 
 * @RibbonClient cliente RIBBON, para configurar nuevo puerto nos vamos para
 *               runConfigurations y en argumentos de la MV
 *               agregamops-Dserver.port=9001
 */
@RibbonClient(name = "servicio-productos")
@EnableFeignClients
@SpringBootApplication
public class SpringBootServicioItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServicioItemApplication.class, args);
	}

}
