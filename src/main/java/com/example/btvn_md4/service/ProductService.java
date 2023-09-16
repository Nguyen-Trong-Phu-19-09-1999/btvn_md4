package com.example.btvn_md4.service;

import com.example.btvn_md4.model.Product;
import com.example.btvn_md4.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private IProductRepository productRepository;
    public List<Product> findAll(){
        return (List<Product>) productRepository.findAll();
    }
    public Product fineOne(Long id){
        return productRepository.findById(id).get();
    }
    public void save(Product product){
        productRepository.save(product);
    }

    public void delete(Long id){
        Product product = fineOne(id);
        productRepository.delete(product);
    }
}
