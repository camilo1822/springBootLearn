package com.jucarbol.productos.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jucarbol.productos.models.entity.Producto;
import com.jucarbol.productos.models.service.IProductoService;

/*Convierte a json lo que devuelve los metodos handler*/
@RestController
public class ProductoController {

	/**
	 * Enviroment para acceder al application.properties
	 */
	@Autowired
	private Environment env;

	/**
	 * Otra opacion para tener varialbes de entorno
	 */
	@Value("${server.port}")
	private Integer port;

	@Autowired
	private IProductoService productoService;

	/* Para probar seria: http://localhost:8001/listar */
	@GetMapping("/listar")
	public List<Producto> listar() {
		// server.port o local.server.port
		return productoService.findAll().stream().map(producto -> {
			// producto.setPort(Integer.parseInt(env.getProperty("server.port")));
			// Con value seria
			producto.setPort(port);
			return producto;
		}).collect(Collectors.toList());
	}

	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		Producto producto = productoService.findById(id);
		// producto.setPort(Integer.parseInt(env.getProperty("server.port")));
		// Con value seria
		producto.setPort(port);
		return producto;
	}
}
