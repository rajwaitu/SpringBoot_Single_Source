package com.techrocking.repository;

import org.springframework.data.repository.CrudRepository;

import com.techrocking.entity.Product;

public interface ProductRepository  extends CrudRepository<Product, Long> {

}
