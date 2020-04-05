package com.ecommerce.demo.services;

import java.util.List;

import com.ecommerce.demo.entity.Category;

public interface CategoryService {

	public List<Category> getAllCategories();
	public void addCategory(Category category);
	public void deleteCateogry(int id);
	public Category getCategory(int id);
	public List<Category> getSubCategories(int id);
	
}
