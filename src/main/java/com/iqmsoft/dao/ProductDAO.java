package com.iqmsoft.dao;

import java.util.List;

import com.iqmsoft.model.Product;

public interface ProductDAO {

	boolean addProduct(Product product);
	
	boolean deleteProduct(Product product);
	
	boolean updateProduct(Product product);
	
	List<Product> searchProduct(String productName);
	
	Product getProductById(int id);
	
	List<Product> getAllProductByPrice(double price);
}
