package com.mifel.servicio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mifel.servicio.entity.Items;

public interface  ItemsRepository extends JpaRepository<Items, Long> {

}
