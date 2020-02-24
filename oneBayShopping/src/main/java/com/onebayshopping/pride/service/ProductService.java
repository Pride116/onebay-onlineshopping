package com.onebayshopping.pride.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebayshopping.pride.model.Product;
import com.onebayshopping.pride.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productrepo;
	
	//retrieve products from database
	public List<Product> getProducts(){
		
		return productrepo.findAll();
	}
	//retrieve product from database
		public Optional<Product> getProduct(int id){
			
			return productrepo.findById(id);
		}
		
		//Adding a product to the database
	public String Addproduct(Product product) {
		
		productrepo.save(product);
		return"Product add succuessfully!";
	}
	
	//Updating a product 
	public String UpdateproductDetails(Product product) {
		
		productrepo.save(product);
		return"Product details updated!";
	}
	
	//Delete Product from database
	public String deleteProduct(int id) {
		
		productrepo.deleteById(id);
		
		return "Product Removed";
	}
}
