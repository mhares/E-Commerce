package com.ecommerce.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.demo.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	@Query(value = "SELECT * FROM CATEGORY WHERE PARENT_CATEGORY = ?1", nativeQuery = true)
	public List<Category> getSubCategories(int id);

}
