package com.jucarbol.item;

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
	 * @return {@link RestTemplate}
	 */
	@Bean("clienteRest")
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}

}
