package com.jucarbol.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jucarbol.item.models.Producto;

/**
 * Anotacion para decir que la interface sera un cliente feign, en el name
 * ponemos el nombre configurado de la app a consumir en el archivo
 * application.properties
 * 
 * 
 * Cuando usamos RIBBON desligamos el puerto ya no qeudaria
 * @FeignClient(name = "servicio-productos", url = "localhost:8001")
 */
@FeignClient(name = "servicio-productos")
public interface ProductoClienteRest {
	
	/**Anotación para definir el contexto de consumo**/
	@GetMapping("/listar")
	public List<Producto> listar();
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id);

}
