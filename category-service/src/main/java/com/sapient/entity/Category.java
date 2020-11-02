package com.sapient.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "categories")
@Data
public class Category {
	@Id
	private Integer id;
	private String name;
	private String description;
}
