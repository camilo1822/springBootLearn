package com.jucarbol.productos.models.service;

import java.util.List;

import com.jucarbol.productos.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();

	public Producto findById(Long id);
}
