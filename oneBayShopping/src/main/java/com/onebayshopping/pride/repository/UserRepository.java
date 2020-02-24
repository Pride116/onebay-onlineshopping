package com.onebayshopping.pride.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onebayshopping.pride.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
