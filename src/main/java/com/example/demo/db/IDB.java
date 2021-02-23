package com.example.demo.db;

import com.example.demo.data.Product;

import java.util.List;
import java.util.Map;

public interface IDB {
    void init();
    //    User can retrieve all products in the store.
    Map<String,Product> getAllProducts();

    //    User can retrieve a single product in the store according to its ID.
    Product getProductById(String productId);

    //    User can add a new product.
    void addProduct(String productId,Product product);

    //    User can remove an existing product.
    void removeProductById(String productId);

    //    User can change some detail of the already existing product.
    void updateProductById(String productId, String field);

    void setDetilsByProductId(String id, String detailId, String detailNewValue);
}
