package com.onebayshopping.pride.model;

import javax.persistence.*;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String descrption;
	
	@Column(nullable = false)
	private String imageurl;
	
	@Column(nullable = false)
	private double price;
	
	@Column(nullable = false)
	private int quntity;
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable = false)
	private Category category;

}
