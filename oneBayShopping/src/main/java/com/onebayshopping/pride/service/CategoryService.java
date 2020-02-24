package com.onebayshopping.pride.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebayshopping.pride.model.Category;

import com.onebayshopping.pride.repository.CategoryRepository;


@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryrepo;

	// retrieve Category from database
	public List<Category> getCategorys() {

		return categoryrepo.findAll();
	}

	// retrieve Category from database
	public Optional<Category> getProduct(int id) {

		return categoryrepo.findById(id);
	}

	// Adding a Category to the database
	public String addCategory(Category category) {

		categoryrepo.save(category);
		return "Product add succuessfully!";
	}

	// Updating a Category
	public String updateCategory(Category category) {

		categoryrepo.save(category);
		return "Product details updated!";
	}

	// Delete Category from database
	public String deleteCategory(int id) {

		categoryrepo.deleteById(id);

		return "Category Removed";
	}
}
