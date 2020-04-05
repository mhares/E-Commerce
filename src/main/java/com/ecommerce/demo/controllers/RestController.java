package com.ecommerce.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.demo.entity.Category;
import com.ecommerce.demo.services.CategoryService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/categories")
	public List<Category> getCateg(){
	return	categoryService.getAllCategories();
	}
	
	@PostMapping("/addCategory")
	public void addCategory(@RequestBody Category category) {
		categoryService.addCategory(category);
	}
	
	@DeleteMapping("/deleteCategory/{id}")
	public void deleteCategory( @PathVariable int id) {
		categoryService.deleteCateogry(id);
	}

	@PutMapping("/updateCategory")
	public void updateCategory(@RequestBody Category category)
	{
		categoryService.addCategory(category);
	}	
	
	@GetMapping("/categories/{id}")
	public List<Category> getSubCategory(@PathVariable int id){
		return categoryService.getSubCategories(id);
	}
}
