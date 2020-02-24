package com.onebayshopping.pride.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onebayshopping.pride.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
