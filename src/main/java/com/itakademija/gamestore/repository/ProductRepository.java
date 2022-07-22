package com.itakademija.gamestore.repository;

import com.itakademija.gamestore.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    Product findByName(String name);

}
