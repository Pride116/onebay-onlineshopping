package com.onebay.onlineShopping.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.onebay.onlineShopping.model.Book;

@CrossOrigin(origins = "*")
public interface BookRepository extends JpaRepository<Book , Long>{
	
	@RestResource(path = "category")
	Page<Book> findByCategoryId(Long id, Pageable pageable);
	
	@RestResource(path = "book")
	Page<Book> findByNameContaining(String name, Pageable pageable);
	

}
