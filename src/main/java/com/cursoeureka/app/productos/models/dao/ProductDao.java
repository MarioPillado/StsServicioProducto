package com.cursoeureka.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cursoeureka.app.productos.models.entity.Product;

public interface ProductDao extends CrudRepository<Product, Long>{

}
