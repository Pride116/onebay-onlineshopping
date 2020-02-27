package com.onebay.onlineShopping.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.onebay.onlineShopping.model.Book;
import com.onebay.onlineShopping.model.BookCategory;

@Configuration
public class RepoConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		config.exposeIdsFor(Book.class);
		config.exposeIdsFor(BookCategory.class);
	}
}
