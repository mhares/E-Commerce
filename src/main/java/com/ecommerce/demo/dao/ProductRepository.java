package com.ecommerce.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.demo.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query(value = "SELECT * FROM PRODUCT WHERE CATEGORY_ID = ?1", nativeQuery = true)
	public List<Product> getProductByCategoryId(int categoryId);

}
