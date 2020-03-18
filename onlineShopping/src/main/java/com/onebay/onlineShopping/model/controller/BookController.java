package com.onebay.onlineShopping.model.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebay.onlineShopping.model.Book;
import com.onebay.onlineShopping.repository.BookRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("book")
public class BookController {

	@Autowired
	private BookRepository bookrepo;
	
	@GetMapping("/list")
	public List<Book> getBookList()
	{
		return bookrepo.findAll();
	}
	
	@GetMapping("category/{id}")
	public List<Book> getBookByCategory(@PathVariable Long id)
	{
		return bookrepo.findByCategoryId(id);
	}
	@GetMapping("/{id}")
	public Optional<Book> getBookListById(@PathVariable Long id)
	{
		return bookrepo.findById(id);
	}
	@GetMapping("search/{name}")
	public List<Book> getBookListByName(@PathVariable String name)
	{
		return bookrepo.findByNameContaining(name);
	}
    
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable Long id) {
		
		bookrepo.deleteById(id);
	
		//return "Book successfully deleted!!";
	}
}
	

