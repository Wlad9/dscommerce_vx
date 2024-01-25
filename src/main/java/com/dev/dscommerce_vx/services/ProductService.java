package com.dev.dscommerce_vx.services;

import com.dev.dscommerce_vx.dto.ProductDTO;
import com.dev.dscommerce_vx.entities.Product;
import com.dev.dscommerce_vx.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Optional<Product> result = repository.findById(id);
        if(result.isPresent()){
            Product product = result.get();
            return new ProductDTO(product);
        }
        return null;
    }
    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable){
        Page<Product> result = repository.findAll(pageable);
        return result.map(x-> new ProductDTO(x));
    }
}
