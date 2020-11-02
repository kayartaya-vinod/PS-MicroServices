package com.sapient.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sapient.entity.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, Integer> {

}
