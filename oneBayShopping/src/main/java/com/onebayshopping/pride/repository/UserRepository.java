package com.onebayshopping.pride.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.onebayshopping.pride.model.User;


@CrossOrigin("*")
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
