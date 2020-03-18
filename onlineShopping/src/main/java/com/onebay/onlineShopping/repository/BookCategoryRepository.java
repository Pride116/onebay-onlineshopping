package com.onebay.onlineShopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.onebay.onlineShopping.model.BookCategory;

@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
