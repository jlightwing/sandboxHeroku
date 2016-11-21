package com.sandbox;

import com.sandbox.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@EnableAutoConfiguration
@SpringBootApplication
public class MainWebApp
{
  @Bean
  public List<Product> product()
  {
    ArrayList<Product> products = new ArrayList<Product>();

    products.add(new Product("1", "shoe"));
    products.add(new Product("2", "hat"));
    products.add(new Product("3", "scarf"));

    return products;
  }

  public static void main(String[] args)
  {
    SpringApplication.run(MainWebApp.class, args);
  }
}
