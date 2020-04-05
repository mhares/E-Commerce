package com.ecommerce.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.demo.dao.ProductRepository;
import com.ecommerce.demo.entity.Category;
import com.ecommerce.demo.entity.Product;
import com.ecommerce.demo.services.CategoryService;
import com.ecommerce.demo.services.ProductService;

@RestController
public class ProductController {
  
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return productService.getAllProducts();
	}
	
	@PostMapping("/addProduct/{id}")
	public void addProduct(@RequestBody Product product,@PathVariable int id) {
		Category category = categoryService.getCategory(id);
		product.setCategory(category);
		productService.addProduct(product);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public void deleteById(@PathVariable int id) {
		
    productService.deleteProduct(id);
}
	
	
      @PutMapping("/updataProduct")
     public void updateProject(@RequestBody Product product) {
    	productService.addProduct(product);
      }

      @GetMapping("/products/{categoryId}")
      public List<Product> getProductsById(@PathVariable int categoryId){
    	  return productService.getProductByCategoryId(categoryId);
      }
      
}