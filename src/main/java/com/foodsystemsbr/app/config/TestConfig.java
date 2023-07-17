package com.foodsystemsbr.app.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.foodsystemsbr.app.entities.Category;
import com.foodsystemsbr.app.repositories.CategoryRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("iniciando carga no tb_category");
		// TODO Auto-generated method stub
		
		Category cat1 = new Category(null,"Bebidas");
		Category cat2 = new Category(null,"Petiscos");
		Category cat3 = new Category(null,"Drinks");
		Category cat4 = new Category(null,"Sanduiches");
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3,cat4));
		
		
	}
	
	
	
	

}
