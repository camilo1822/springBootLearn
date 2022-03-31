package com.jucarbol.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jucarbol.item.models.Item;
import com.jucarbol.item.models.service.ItemService;

@RestController
public class ItemController {

	/**
	 * La anotacion @Quprimary en la implementacionalifier es para decir cual
	 * implementacion de la interface usar, se puede usar esta anotacion o el
	 * @Primary en la implementacion
	 **/
	@Autowired
	@Qualifier("serviceFeign")
	private ItemService itemService;

	@GetMapping("/listar")
	public List<Item> listar() {
		return itemService.findAll();
	}

	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return itemService.findById(id, cantidad);
	}

}
