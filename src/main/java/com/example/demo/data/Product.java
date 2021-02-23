package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String productName;
    int productPrice;
    String CategoryName;

    public Product(String productName, Integer productPrice, String categoryName) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.CategoryName = categoryName;
    }

    public Product(){

    }
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public String getCategoryName() {
        return CategoryName;
    }
}
