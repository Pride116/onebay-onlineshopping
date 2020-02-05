package com.onebayshopping.pride.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onebayshopping.pride.entities.Category;


@Repository
public interface CategoryRespository extends JpaRepository<Category, Integer> {

}
