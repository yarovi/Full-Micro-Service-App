package com.yasmani.net.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.yasmani.net.entity.ProductEntity;
import com.yasmani.net.repository.ProductRepository;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

	private ProductRepository productRepository;
	
	public ProductController(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<ProductEntity>> getAllProduct() {
		
		ResponseEntity<List<ProductEntity>> response 
		= new ResponseEntity<List<ProductEntity>>(productRepository.findAll(), HttpStatus.OK);
		return response;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct(@RequestBody ProductEntity productEntity) {
		if (productEntity.getClass().equals(null)) {
			throw new RuntimeException("Id must be null");
		}
		productRepository.save(productEntity);
	}
}
