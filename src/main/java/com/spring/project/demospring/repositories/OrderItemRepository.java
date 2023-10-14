package com.spring.project.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.demospring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
