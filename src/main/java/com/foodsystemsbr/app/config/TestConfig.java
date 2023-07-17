package com.foodsystemsbr.app.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.foodsystemsbr.app.entities.Category;
import com.foodsystemsbr.app.entities.Product;
import com.foodsystemsbr.app.repositories.CategoryRepository;
import com.foodsystemsbr.app.repositories.ProductRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("iniciando carga no tb_category");
		// TODO Auto-generated method stub
		
		Category cat1 = new Category(null,"Bebidas");
		Category cat2 = new Category(null,"Petiscos");
		Category cat3 = new Category(null,"Drinks");
		Category cat4 = new Category(null,"Sanduiches");
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3,cat4));
		
		Product prod1 = new Product(null, "Vinho 1 CABERNET SAUVIGNON","Sibaris Gran Reserva D.O. Valle del Maule Cabernet Sauvignon 2021", 114.90, "https://www.wine.com.br/cdn-cgi/image/f=png,h=515,q=99/assets-images/produtos/28418-01.png");
		Product prod2 = new Product(null, "Vinho 2 CABERNET SAUVIGNON","U by Undurraga Valle Central Rosé 2022", 54.90, "https://www.wine.com.br/cdn-cgi/image/f=png,h=515,q=99/assets-images/produtos/28894-01.png");
		Product prod3 = new Product(null, "Vinho 3 CABERNET SAUVIGNON","Mise de la Baronnie A.O.C. Médoc 2017", 249.90, "https://www.wine.com.br/cdn-cgi/image/f=png,h=515,q=99/assets-images/produtos/23811-01.png");
		
		Product prod4 = new Product(null, "Whopper Choripan"," Pão fofinho com gergelim, alface fresquinha, tomate fatiado na loja, cebola, 2 fatias de queijo sabor cheddar bem derretido, molho de temperos de chimichurri e hambúrguer tipo linguiça toscada suína grelhado no fogo como churrasco", 24.90, "https://d3sn2rlrwxy0ce.cloudfront.net/Whopper_Choripan-1.png?mtime=20230516173138&focal=none");
		Product prod5 = new Product(null, "Bacon com Whopper","Pão fofinho com gergelim, nossa maionese exclusiva, alface fresquinha, tomate fatiado na loja, cebola, picles, fatias de queijo sabor cheddar bem derretido, bacon em cubos bem crocantes e hambúrguer de carne 100% bovina grelhado no fogo como churrasco.", 28.90, "https://d3sn2rlrwxy0ce.cloudfront.net/Bacon_com_Whopper-1.png?mtime=20230404233706&focal=none");
		Product prod6 = new Product(null, "WHOPPER® Duplo","Pão com gergelim, dois suculentos hambúrgueres de pura carne bovina, duas fatias de cheddar, quatro fatias de picles, alface, tomate, cebola, maionese e ketchup.", 29.90, "https://d3sn2rlrwxy0ce.cloudfront.net/Whopper-DP.png?mtime=20221203102352&focal=none");
		
		productRepository.saveAll(Arrays.asList(prod1, prod2, prod3, prod4, prod5, prod6));
		
	}
	
	
	
	

}
