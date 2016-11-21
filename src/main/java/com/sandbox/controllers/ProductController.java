package com.sandbox.controllers;

import com.sandbox.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController
{
  @Autowired
  private List<Product> products;

  @RequestMapping("/product/{code}")
  public Product getProduct(@PathVariable String code)
  {
    for(Product product : products)
    {
      if (code.equals(product.getCode()))
      {
        return product;
      }
    }

    return new Product();
  }
}
