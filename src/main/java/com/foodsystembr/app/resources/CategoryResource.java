package com.foodsystembr.app.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodsystembr.app.dto.CategoryDTO;
import com.foodsystembr.app.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService;
	
	
	@GetMapping
	public ResponseEntity<List<CategoryDTO>> findAll(){
		
		return ResponseEntity.ok().body(categoryService.findAll());
		
	}

}
