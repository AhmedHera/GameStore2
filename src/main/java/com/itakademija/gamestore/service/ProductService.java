package com.itakademija.gamestore.service;

import com.itakademija.gamestore.entity.Product;
import com.itakademija.gamestore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        var productsIterator = this.productRepository.findAll();
        var products = new ArrayList<Product>();
        productsIterator.iterator().forEachRemaining(products::add);

        return products;
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

}