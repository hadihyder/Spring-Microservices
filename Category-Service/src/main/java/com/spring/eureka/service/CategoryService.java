package com.spring.eureka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.eureka.Category;
import com.spring.eureka.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	private CategoryRepository categoryRepository;

	public CategoryService(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	public CategoryRepository getCategoryRepository() {
		return categoryRepository;
	}

	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	public Category add(Category category) {
		return categoryRepository.save(category);
	}
}
