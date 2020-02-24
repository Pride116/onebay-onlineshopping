package com.onebayshopping.pride.model;


import java.util.List;

import javax.persistence.*;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int id;
	@Column(nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Product> product;
}
