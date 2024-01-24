package com.dev.dscommerce_vx.controllers;

import com.dev.dscommerce_vx.dto.ProductDTO;
import com.dev.dscommerce_vx.entities.Product;
import com.dev.dscommerce_vx.repositories.ProductRepository;
import com.dev.dscommerce_vx.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductService service;
    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id){
        ProductDTO dto = service.findById(id);
        return dto;
    }
}
