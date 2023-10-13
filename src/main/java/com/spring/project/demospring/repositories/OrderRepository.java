package com.spring.project.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.demospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
