package com.onebayshopping.pride.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebayshopping.pride.model.Product;
import com.onebayshopping.pride.service.ProductService;

@RestController
@RequestMapping("product")
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	//Add new  
	
	@PostMapping("/add")
	public String AddNew(@RequestBody Product product) {
		
		return productservice.Addproduct(product);
	}
	//Get ALL
	@GetMapping("/all")
	public List<Product> getAll(){
		return productservice.getProducts();
	}
	//Get One
	@GetMapping("/one")
	public Optional<Product> getOne(@PathVariable int id){
		return productservice.getProduct(id);
	}
	//Update
	@PutMapping("/update")
	public String update(@RequestBody Product product)
	{
		return productservice.UpdateproductDetails(product);
	}
	//Remove
	@DeleteMapping("/remove")
	public String delete(@RequestBody int id)
	{
		return productservice.deleteProduct(id);
	}
	
	@GetMapping(path="/home")
	public String home()
	{
		return "hi pride";
	}
	

}
