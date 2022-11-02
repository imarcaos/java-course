package com.inxinet.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inxinet.webservice.entities.Product;
import com.inxinet.webservice.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product finById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
