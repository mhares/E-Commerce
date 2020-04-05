package com.ecommerce.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.dao.ProductRepository;
import com.ecommerce.demo.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productrRepository;
	@Override
	public List<Product> getAllProducts() {
				return productrRepository.findAll();
	}

	@Override
	public void addProduct(Product product) {
		productrRepository.save(product);
		
	}

	@Override
	public void deleteProduct(int id) {
     productrRepository.deleteById(id);
	}

	@Override
	public List<Product> getProductByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		return productrRepository.getProductByCategoryId(categoryId);
	}

}
