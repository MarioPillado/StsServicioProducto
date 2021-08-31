package com.cursoeureka.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursoeureka.app.productos.models.dao.ProductDao;
import com.cursoeureka.app.productos.models.entity.Product;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	private ProductDao productDao; //Objeto de la capa de acceso a datos
	
	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		return (List<Product>)productDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Product findByID(Long id) {
		return productDao.findById(id).orElse(null);
	}

}
