package com.onebay.onlineShopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.onebay.onlineShopping.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	
}
