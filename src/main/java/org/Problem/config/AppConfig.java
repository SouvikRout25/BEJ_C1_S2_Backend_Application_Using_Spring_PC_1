package org.Problem.config;

import org.Problem.domain.Product;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("Nescafe")
    public Product getProduct1(){
        return new Product(101,"Nescafe",50.65);
    }

    @Bean("Bru")
    public Product getProduct2(){
        return new Product(102,"Bru",45.99);
    }
}