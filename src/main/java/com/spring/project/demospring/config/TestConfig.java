package com.spring.project.demospring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.project.demospring.entities.User;
import com.spring.project.demospring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User p1 = new User("Emanuel", "emanuelsmcastro3@gmail.com", "123123", "123123");
        User p2 = new User("Carl", "carl3@gmail.com", "123123", "123123");

        userRepository.saveAll(Arrays.asList(p1, p2));
    }

}
