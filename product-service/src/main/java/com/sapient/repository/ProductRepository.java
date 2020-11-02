package com.sapient.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sapient.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
