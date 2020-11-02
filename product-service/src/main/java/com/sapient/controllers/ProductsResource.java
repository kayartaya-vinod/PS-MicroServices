package com.sapient.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.entity.Product;
import com.sapient.repository.ProductRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/products")
public class ProductsResource {

	@Autowired
	private ProductRepository repo;

	@GetMapping("/{id}")
	public Product getById(@PathVariable Integer id) {
		return repo.findById(id).get();
	}

	@GetMapping
	public List<Product> getAll() {
		return repo.findAll();
	}
}
