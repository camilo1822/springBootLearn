package com.jucarbol.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jucarbol.productos.models.entity.Producto;
import com.jucarbol.productos.models.service.IProductoService;

/*Convierte a json lo que devuelve los metodos handler*/
@RestController
public class ProductoController {

	@Autowired
	private IProductoService productoService;

	/*Para probar seria: http://localhost:8001/listar*/
	@GetMapping("/listar")
	public List<Producto> listar() {
		return productoService.findAll();
	}

	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		return productoService.findById(id);
	}
}
