package com.jucarbol.item;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Nos bermite crear Beans de spring y registrarlas en el contenedor
 * 
 * @author camilo
 * @since 25/03/2022
 *
 */
@Configuration
public class AppConfig {

	/**
	 * Cliente para trabajar con apiRest, cliente http
	 * 
	 * Para balanceo de cargas con RIBBON utilizamos la anotación @LoadBalanced
	 * cuando usamos restTemplate
	 * 
	 * @return {@link RestTemplate}
	 */
	@Bean("clienteRest")
	@LoadBalanced
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}

}
