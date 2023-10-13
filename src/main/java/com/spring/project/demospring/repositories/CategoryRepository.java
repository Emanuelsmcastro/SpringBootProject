package com.spring.project.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.demospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
