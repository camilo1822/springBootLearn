package com.jucarbol.item.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jucarbol.item.models.Item;
import com.jucarbol.item.models.Producto;

@Service("serviceRestTemplate")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Item> findAll() {
		// llamado rest
		/*
		 * List<Producto> productos = Arrays
		 * .asList(clienteRest.getForObject("http://localhost:8001/listar",
		 * Producto[].class));
		 */
		// Para balanceo de carga con ribbon desligamos host y puesto y lo cambiamos por
		// el nombre del servicio
		List<Producto> productos = Arrays
				.asList(clienteRest.getForObject("http://servicio-productos/listar", Producto[].class));
		// Por cada producto creamos un List con cantidad por defecto 1, y lo
		// convertimos a lista por que el retorno que se espera con collect
		return productos.stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		// Llamado rest con tercer parametro para variables en la url
		// Producto producto =
		// clienteRest.getForObject("http://localhost:8001/ver/{id}", Producto.class,
		// pathVariables);
		// Para balanceo de carga con ribbon desligamos host y puesto y lo cambiamos por
		// el nombre del servicio
		Producto producto = clienteRest.getForObject("http://servicio-productos/ver/{id}", Producto.class,
				pathVariables);
		return new Item(producto, cantidad);
	}

}
