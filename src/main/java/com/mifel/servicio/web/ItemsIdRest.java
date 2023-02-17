package com.mifel.servicio.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mifel.servicio.entity.Items;
import com.mifel.servicio.model.service.ItemsService;

@RestController
@RequestMapping("/rest/itemsGetId")
public class ItemsIdRest {

	@Autowired
	private ItemsService itemService;
	
	@PostMapping
	public ResponseEntity<Items> dataTestId(@RequestBody final Items item){
		try {
			Items items = new Items();
			items = (Items) itemService.getById(item.getId());
			Items items1 = new Items();
			items1.setId(items.getId());
			items1.setNombre(items.getNombre());
			items1.setDescription(items.getDescription());
			items1.setStatus(items.getStatus());
			items1.setCreationDate(items.getCreationDate());
			return new ResponseEntity<Items>(items1,null,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Items>(null,null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
