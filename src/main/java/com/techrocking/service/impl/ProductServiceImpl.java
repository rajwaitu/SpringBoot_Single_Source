package com.techrocking.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.techrocking.entity.Product;
import com.techrocking.exception.ProductNotFoundException;
import com.techrocking.payloads.ProductRequest;
import com.techrocking.payloads.ProductResponse;
import com.techrocking.repository.ProductRepository;
import com.techrocking.service.IProductService;
import com.techrocking.util.ServiceConstants;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public ProductResponse getProduct(Long id) {
		Optional<Product> productEntityOtional = productRepository.findById(id);
		
		if(!productEntityOtional.isPresent()) {
			ProductNotFoundException exc = new ProductNotFoundException(ServiceConstants.PRODUCT_NOT_FOUND_ERROR, HttpStatus.NOT_FOUND);
			throw exc;
		}
		
		Product productEntity = productEntityOtional.get();
		ProductResponse response =  new ProductResponse();
		response.setName(productEntity.getName());
		response.setPrice(productEntity.getPrice());
		response.setId(productEntity.getId());
		
		return response;
	}

	@Override
	public ProductResponse createProduct(ProductRequest product) {
		Product productEntity = new Product();
		productEntity.setName(product.getName());
		productEntity.setPrice(product.getPrice());
		
		Product savedProduct = productRepository.save(productEntity);
		
		ProductResponse response =  new ProductResponse();
		response.setName(savedProduct.getName());
		response.setPrice(savedProduct.getPrice());
		response.setId(savedProduct.getId());
		return response;
	}

	@Override
	public ProductResponse updateProduct(Long id, ProductRequest product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		
	}

}
