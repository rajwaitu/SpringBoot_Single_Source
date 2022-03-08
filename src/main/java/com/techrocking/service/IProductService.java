package com.techrocking.service;

import com.techrocking.payloads.ProductRequest;
import com.techrocking.payloads.ProductResponse;

public interface IProductService {
	
	public ProductResponse getProduct(Long id);
	
	public ProductResponse createProduct(ProductRequest product);
	
	public ProductResponse updateProduct(Long id, ProductRequest product);
	
	public void deleteProduct(Long id);

}
