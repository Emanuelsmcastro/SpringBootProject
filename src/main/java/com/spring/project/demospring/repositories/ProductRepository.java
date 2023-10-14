package com.spring.project.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.demospring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
