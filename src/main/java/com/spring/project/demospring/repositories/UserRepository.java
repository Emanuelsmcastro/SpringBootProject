package com.spring.project.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.demospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
