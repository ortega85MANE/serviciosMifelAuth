package com.mifel.servicio.model;

public class Item {
	
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Item(Long id, String nombre, String description, Integer status) {
		this.id = id;
	}
	public Item() {
		super();
	}

}
