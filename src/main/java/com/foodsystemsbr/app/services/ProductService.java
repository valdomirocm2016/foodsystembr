package com.foodsystemsbr.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodsystemsbr.app.dto.ProductDTO;
import com.foodsystemsbr.app.entities.Product;
import com.foodsystemsbr.app.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<ProductDTO> findAll(){
		
		List<Product> list= productRepository.findAll();
		return list.stream().map(it-> new ProductDTO(it)).collect(Collectors.toList());
	}
}
