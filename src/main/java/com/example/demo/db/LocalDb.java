package com.example.demo.db;

import com.example.demo.data.Category;
import com.example.demo.data.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalDb implements IDB {
    private Map<String,Product> products;

    @Override
    public void init() {
        this.products = new HashMap<>();
//        products.put("f-10100",new Product( "Levi's 510", 503, Category.Jeans));
//        products.put("f-10200",new Product( "Castro 10", 313, Category.Jeans));
//        products.put("f-10300",new Product( "Piano Fun", 523, Category.Toys));
//        products.put("f-10400",new Product( "Lego Fun", 303, Category.Toys));
//        products.put("f-10500",new Product( "Car", 453, Category.Automobile));
    }

    @Override
    public Map<String,Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(String productId) {
        return this.products.get(productId);
    }

    @Override
    public void addProduct(String productId,Product product) {
        products.put(productId, product);
    }

    @Override
    public void removeProductById(String productId) {
        Product product = this.getProductById(productId);

        if (product == null) {
            System.out.print("productId not found");
            return;
        }

        this.products.remove(product);

        return;
    }

    @Override
    public void updateProductById(String productId, String field) {

    }

    @Override
    public void setDetilsByProductId(String id, String detailId, String detailNewValue) {

    }
}
