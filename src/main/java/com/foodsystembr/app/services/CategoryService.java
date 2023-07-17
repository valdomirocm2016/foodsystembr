package com.foodsystembr.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodsystembr.app.dto.CategoryDTO;
import com.foodsystembr.app.entities.Category;
import com.foodsystembr.app.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<CategoryDTO> findAll(){
		List<Category> list= categoryRepository.findAll();
		
		return list.stream().map(it -> new CategoryDTO(it)).collect(Collectors.toList());
		
	}
	

}
