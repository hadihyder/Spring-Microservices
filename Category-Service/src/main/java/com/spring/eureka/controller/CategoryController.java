package com.spring.eureka.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.eureka.Category;
import com.spring.eureka.service.CategoryService;

@RestController
@RequestMapping("categories")
public class CategoryController {
	
	private CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping("/all")
	public List<Category> getAllCategories(){
		return categoryService.findAll();
	}
	
	@PostMapping("/add")
	public Category addCategory(@RequestBody Category category) {
		return categoryService.add(category);
	}
	
}
