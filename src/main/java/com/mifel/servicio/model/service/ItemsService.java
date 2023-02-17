package com.mifel.servicio.model.service;

import java.util.List;

import com.mifel.servicio.entity.Items;

public interface ItemsService{	

	public List<Items> getItems();

	Items getById(Long id);
	
}
