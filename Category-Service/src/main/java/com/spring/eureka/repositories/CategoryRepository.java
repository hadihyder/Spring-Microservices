package com.spring.eureka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.eureka.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
