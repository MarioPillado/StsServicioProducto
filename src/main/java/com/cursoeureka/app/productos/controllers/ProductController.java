package com.cursoeureka.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cursoeureka.app.productos.models.entity.Product;
import com.cursoeureka.app.productos.models.service.IProductService;

@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@GetMapping("/listar")
	public List<Product> listar(){
		return productService.findAll();
	}

	@GetMapping("/listar/{id}")
	public Product detalle(@PathVariable long id) {
		return productService.findByID(id);
	}
	
}
