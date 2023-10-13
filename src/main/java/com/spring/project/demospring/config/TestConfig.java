package com.spring.project.demospring.config;

import java.util.Arrays;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.project.demospring.entities.Order;
import com.spring.project.demospring.entities.User;
import com.spring.project.demospring.repositories.OrderRepository;
import com.spring.project.demospring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User p1 = new User("Emanuel", "emanuelsmcastro3@gmail.com", "123123", "123123");
        User p2 = new User("Carl", "carl3@gmail.com", "123123", "123123");

        Order o1 = new Order(Instant.parse("2019-06-20T19:53:07Z"), p1);
        Order o2 = new Order(Instant.parse("2019-07-20T19:53:07Z"), p2);
        Order o3 = new Order(Instant.parse("2019-08-20T19:53:07Z"), p1);

        userRepository.saveAll(Arrays.asList(p1, p2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }

}
