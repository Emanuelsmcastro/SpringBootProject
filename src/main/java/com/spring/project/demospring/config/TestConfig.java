package com.spring.project.demospring.config;

import java.util.Arrays;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.project.demospring.entities.Category;
import com.spring.project.demospring.entities.Order;
import com.spring.project.demospring.entities.OrderItem;
import com.spring.project.demospring.entities.Payment;
import com.spring.project.demospring.entities.Product;
import com.spring.project.demospring.entities.User;
import com.spring.project.demospring.repositories.CategoryRepository;
import com.spring.project.demospring.repositories.OrderItemRepository;
import com.spring.project.demospring.repositories.OrderRepository;
import com.spring.project.demospring.repositories.ProductRepository;
import com.spring.project.demospring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {
        User p1 = new User("Emanuel", "emanuelsmcastro3@gmail.com", "123123", "123123");
        User p2 = new User("Carl", "carl3@gmail.com", "123123", "123123");

        Order o1 = new Order(Instant.parse("2019-06-20T19:53:07Z"), p1);
        Order o2 = new Order(Instant.parse("2019-07-20T19:53:07Z"), p2);
        Order o3 = new Order(Instant.parse("2019-08-20T19:53:07Z"), p1);

        Category cat1 = new Category("Electronics");
        Category cat2 = new Category("Books");
        Category cat3 = new Category("Computers");

        Product prod1 = new Product("Headset", 500.00);
        Product prod2 = new Product("Computador", 5000.00);
        Product prod3 = new Product("Java", 300.00);

        Payment pay1 = new Payment(Instant.parse("2019-07-20T19:53:07Z"), o1);

        prod1.getCategories().addAll(Arrays.asList(cat3, cat1));
        prod3.getCategories().add(cat2);
        prod2.getCategories().addAll(Arrays.asList(cat2, cat1));

        userRepository.saveAll(Arrays.asList(p1, p2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(prod1, prod2, prod3));

        OrderItem oi1 = new OrderItem(o3, prod3, 2, prod3.getPrice());
        OrderItem oi2 = new OrderItem(o1, prod3, 10, prod3.getPrice());
        OrderItem oi3 = new OrderItem(o3, prod2, 10, prod2.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3));
        o1.setPayment(pay1);
        orderRepository.save(o1);

    }

}
