package com.onebayshopping.pride.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onebayshopping.pride.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
