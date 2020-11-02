package com.sapient.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.entity.Category;
import com.sapient.repository.CategoryRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/categories")
public class CategoriesResource {

	@Autowired
	private CategoryRepository repo;
	
	@GetMapping("/{id}")
	public Category getById(@PathVariable Integer id) {
		return repo.findById(id).get();
	}
	
	@GetMapping
	public List<Category> getAll() {
		return repo.findAll();
	}
}
