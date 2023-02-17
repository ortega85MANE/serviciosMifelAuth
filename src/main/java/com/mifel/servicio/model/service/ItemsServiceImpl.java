package com.mifel.servicio.model.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.mifel.servicio.entity.Items;
import com.mifel.servicio.model.repository.ItemsRepository;

@Service
public class ItemsServiceImpl implements ItemsService {

	private ItemsRepository itemsRepositorio;
	
	public ItemsServiceImpl(ItemsRepository itemsRepositorio) {
		super();
		this.itemsRepositorio = itemsRepositorio;
	}

	@Override
	public List<Items> getItems() {
		return (List<Items>) itemsRepositorio.findAll();
	}
	
	@Override
	public Items getById(Long id) {
		return (Items) itemsRepositorio.getById(id);
	}

}
