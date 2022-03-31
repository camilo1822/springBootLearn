package com.jucarbol.item.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.jucarbol.item.clientes.ProductoClienteRest;
import com.jucarbol.item.models.Item;

/**
 * La anotacion primary es para decir que esta implementacion de la interface
 * sera la que se inyecte por defecto
 * 
 * @author camilo
 *
 */
@Service("serviceFeign")
@Primary
public class ItemServiceFeign implements ItemService {

	@Autowired
	private ProductoClienteRest productoClienteRest;

	@Override
	public List<Item> findAll() {
		return productoClienteRest.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return new Item(productoClienteRest.detalle(id), cantidad);
	}

}
