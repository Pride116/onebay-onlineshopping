package com.onebay.onlineShopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.onebay.onlineShopping.model.Book;

@CrossOrigin(origins = "*")
public interface BookRepository extends JpaRepository<Book , Long>{

}
