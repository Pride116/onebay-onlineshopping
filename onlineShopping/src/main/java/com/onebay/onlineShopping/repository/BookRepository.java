package com.onebay.onlineShopping.repository;



import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.onebay.onlineShopping.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book , Long>{
	
	
	List<Book> findByCategoryId(Long id);
	
	
	List<Book> findByNameContaining(String name);
	

}
