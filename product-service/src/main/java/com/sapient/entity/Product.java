package com.sapient.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document(collection="products")
@Data
public class Product {
	@Id
	private Integer id;
	private String name;
	@Field(name="category_id")
	private Integer categoryId;
	private Double price;
	@Field(name="units_in_stock")
	private Integer unitsInStock;
}
