package com.example.demo.controller;

import com.example.demo.DemoApplication;
import com.example.demo.data.Product;
import com.example.demo.db.IDB;
import com.example.demo.db.LocalDb;
import com.example.demo.db.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository repo;

    // User can retrieve all products in the store
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ResponseEntity<Object> getProducts() {
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

    // User can retrieve a single product in the store according to its ID.
    @RequestMapping(value = "/products/{id}")
    public ResponseEntity<Object> getProduct(@PathVariable("id") int id) {
        return new ResponseEntity<>(repo.findById(id), HttpStatus.OK);
    }

    @PostMapping("/product")
    @ResponseStatus(HttpStatus.CREATED)
    public Product product(@RequestBody Product product) {
        return repo.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable(value = "id") int id) {
        repo.deleteById(id);
    }

    @PutMapping("/product/name/{id}")
    public ResponseEntity<Object> updateName(
            @RequestBody Product product,
            @PathVariable int id) {

        Optional<Product> companyRepo = Optional.ofNullable(repo.findById(id));

        if (!companyRepo.isPresent())
            return ResponseEntity
                    .notFound()
                    .build();

        product.setId(id);

        repo.save(product);

        return ResponseEntity
                .noContent()
                .build();
    }
//
//    // User can remove an existing product.
//    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
////        DemoApplication.db.removeProductById(id);
//        return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
//    }

//    // User can add a new product.
//    @RequestMapping(value = "/products", method = RequestMethod.POST)
//    public ResponseEntity<Object> createProduct(@PathVariable("id") String id, @RequestBody Product product) {
//        DemoApplication.db.addProduct(id, product);
//        return new ResponseEntity<>("Product is created successfully", HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/products/{id}/{detailId}/", method = RequestMethod.POST)
//    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @PathVariable("detailId") String detailId,@RequestBody String detailNewValue) {
//        DemoApplication.db.setDetilsByProductId(id,detailId,detailNewValue);
//        return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
//    }

}
