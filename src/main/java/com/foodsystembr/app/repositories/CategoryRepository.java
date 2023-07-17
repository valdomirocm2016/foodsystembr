package com.foodsystembr.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodsystembr.app.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
