package com.yasmani.net.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.yasmani.net.entity.ProductEntity;

//@NoRepositoryBean
//@Repository
public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
