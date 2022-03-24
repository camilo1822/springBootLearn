package com.jucarbol.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jucarbol.productos.models.dao.ProductoDao;
import com.jucarbol.productos.models.entity.Producto;

/*Registrarla como bean de spring que se puede inyectar mas adelante*/
@Service
public class ProductoServiceImpl implements IProductoService {

	/*
	 * Anotación para inyectar dependencias enlazamos ProductSrviceImpl con
	 * ProductoDao
	 */
	@Autowired
	private ProductoDao productoDao;

	@Override
	/* Para que este sincronizada con la DB, que sea solo lectura */
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		/* si no lo encuentra devuelve null */
		return productoDao.findById(id).orElse(null);
	}

}
