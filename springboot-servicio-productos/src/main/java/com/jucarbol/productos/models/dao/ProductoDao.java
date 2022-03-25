package com.jucarbol.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jucarbol.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
