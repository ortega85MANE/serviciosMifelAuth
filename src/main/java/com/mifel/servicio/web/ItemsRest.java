package com.mifel.servicio.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mifel.servicio.entity.Items;
import com.mifel.servicio.model.service.ItemsService;

@RestController
@RequestMapping("/rest/itemsGet")
public class ItemsRest {

	@Autowired
	private ItemsService itemService;
	
	@GetMapping
	public ResponseEntity<List<Items>> dataTest(){
		try {	
			List<Items> items = new ArrayList<Items>();
			items = itemService.getItems();
			return new ResponseEntity<>(items, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
