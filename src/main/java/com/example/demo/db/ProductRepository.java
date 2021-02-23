package com.example.demo.db;

import com.example.demo.data.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    Product findById(int id);

    List<Product> findAll();

    void deleteById(int id);
}
