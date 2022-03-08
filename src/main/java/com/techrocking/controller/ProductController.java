package com.techrocking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techrocking.payloads.ProductRequest;
import com.techrocking.payloads.ProductResponse;
import com.techrocking.service.IProductService;

@RestController
@RequestMapping("/v1/api")
public class ProductController {
	
	@Autowired
	IProductService productService;

	@GetMapping("/product/{id}")
	ProductResponse getProduct(@PathVariable Long id) {
		return productService.getProduct(id);
	}
	
	@PostMapping("/product")
	ProductResponse createProduct(@RequestBody ProductRequest req) {
        return productService.createProduct(req);
    }

}
