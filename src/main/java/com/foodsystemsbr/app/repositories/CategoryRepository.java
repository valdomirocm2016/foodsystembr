package com.foodsystemsbr.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodsystemsbr.app.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
