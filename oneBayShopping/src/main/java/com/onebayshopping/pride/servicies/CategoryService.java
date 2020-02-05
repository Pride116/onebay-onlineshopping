package com.onebayshopping.pride.servicies;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebayshopping.pride.entities.Category;
import com.onebayshopping.pride.repositories.CategoryRespository;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRespository categoryrepository;
	
	//getlist of category api
public List<Category> getCategorys(){
	
	return categoryrepository.findAll();
}

//save new user

public void insertCateogry(Category categorys) {

	categoryrepository.save(categorys);
}



}
	
	
	


