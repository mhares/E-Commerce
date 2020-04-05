package com.ecommerce.demo.services;

import java.util.List;

import com.ecommerce.demo.entity.Product;

public interface ProductService {
	public List<Product> getAllProducts();
    public void addProduct(Product product);
    public void deleteProduct(int id);
    public List<Product> getProductByCategoryId(int categoryId);
	
}
