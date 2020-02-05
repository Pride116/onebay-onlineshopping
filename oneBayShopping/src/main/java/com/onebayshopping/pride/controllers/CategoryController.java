package com.onebayshopping.pride.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebayshopping.pride.entities.Category;

import com.onebayshopping.pride.servicies.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService cat;
	
	//Get
	@GetMapping("/category")
	public List<Category> getCategorys(){
		
		return cat.getCategorys();
	}
	
	//Post
	@PostMapping("/save")
	public void saveCategory(Category cate) {
		
		cat.insertCateogry(cate);
	}
	
}
