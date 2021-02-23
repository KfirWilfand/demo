package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReportController {

    @RequestMapping(value = "/downloadReport", method = RequestMethod.GET)
    public ResponseEntity<Object> getProducts() {

        return new ResponseEntity<>("todo", HttpStatus.OK);
    }
}
