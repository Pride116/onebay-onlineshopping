package com.onebayshopping.pride.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onebayshopping.pride.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
