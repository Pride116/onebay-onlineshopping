package com.onebay.onlineShopping.model.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.onebay.onlineShopping.model.BookCategory;
import com.onebay.onlineShopping.repository.BookCategoryRepository;


@RestController
@CrossOrigin("*")
@RequestMapping("category")
public class BookCategoryController {

	
	@Autowired
	private BookCategoryRepository catrepo;
	
	@GetMapping("/list")
	public List<BookCategory> getBookList()
	{
		return catrepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<BookCategory> getBookListById(@PathVariable Long id)
	{
		return catrepo.findById(id);
	}
	
	
}
