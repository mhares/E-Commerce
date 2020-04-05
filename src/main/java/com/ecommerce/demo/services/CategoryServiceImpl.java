package com.ecommerce.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.dao.CategoryRepository;
import com.ecommerce.demo.entity.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired 
	 private CategoryRepository  categoryRepository;
	
	public List<Category> getAllCategories(){
		return categoryRepository.findAll();
	}
	
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}

	@Override
	public void deleteCateogry(int id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
		
	}

	@Override
	public Category getCategory(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.getOne(id);
	}

	@Override
	public List<Category> getSubCategories(int id) {
	
		return categoryRepository.getSubCategories(id);
	}

}
