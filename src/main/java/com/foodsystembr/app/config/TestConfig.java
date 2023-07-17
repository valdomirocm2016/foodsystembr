package com.foodsystembr.app.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.foodsystembr.app.entities.Category;
import com.foodsystembr.app.repositories.CategoryRepository;

@Configuration
@Profile("teste")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Category cat1 = new Category(null,"Bebidas");
		Category cat2 = new Category(null,"Petiscos");
		Category cat3 = new Category(null,"Drinks");
		Category cat4 = new Category(null,"Sanduiches");
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3,cat4));
		
		
	}
	
	
	
	

}
