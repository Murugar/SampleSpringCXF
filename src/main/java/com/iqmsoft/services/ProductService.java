package com.iqmsoft.services;

import java.util.List;
import javax.jws.WebParam;

import com.iqmsoft.api.InProduct;
import com.iqmsoft.api.OutProduct;



public interface ProductService {
	
	
	boolean addProduct(@WebParam(name="product") InProduct product) throws BusinessException;
	
	boolean deleteProduct(@WebParam(name="product") InProduct product) throws BusinessException;
	
	boolean updateProduct(@WebParam(name="product") InProduct product) throws BusinessException;
	
	List<OutProduct> searchProduct(@WebParam(name="productName") String productName) throws BusinessException;
	
	OutProduct getProductById(@WebParam(name="id") int id) throws BusinessException;
	
	List<OutProduct> getAllProductByPrice(@WebParam(name="price") double price) throws BusinessException;
}
