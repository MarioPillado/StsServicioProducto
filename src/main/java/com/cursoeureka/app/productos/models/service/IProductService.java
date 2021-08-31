package com.cursoeureka.app.productos.models.service;

import java.util.List;

import com.cursoeureka.app.productos.models.entity.Product;

public interface IProductService {

	public List<Product> findAll();
	public Product findByID(Long id);
}
