package com.foodsystembr.app.dto;

import com.foodsystembr.app.entities.Category;

public class CategoryDTO {
	
	private Long id;
	private String name;
	
	public CategoryDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public CategoryDTO() {
		
	}
	public CategoryDTO(Category entity) {
		
		id= entity.getId();
		name= entity.getName();
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Category toEntity() {
		return new Category(id, name);
	}
	
	
	

}
