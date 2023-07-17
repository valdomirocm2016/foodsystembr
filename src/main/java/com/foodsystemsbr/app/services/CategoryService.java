package com.foodsystemsbr.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodsystemsbr.app.dto.CategoryDTO;
import com.foodsystemsbr.app.entities.Category;
import com.foodsystemsbr.app.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<CategoryDTO> findAll(){
		List<Category> list= categoryRepository.findAll();
		
		return list.stream().map(it -> new CategoryDTO(it)).collect(Collectors.toList());
		
	}
	

}
