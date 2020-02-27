package com.onebay.onlineShopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.onebay.onlineShopping.model.BookCategory;

@CrossOrigin(origins = "*")
@RepositoryRestResource(path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
