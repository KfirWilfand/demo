package com.example.demo;

import com.example.demo.controller.ReportController;
import com.example.demo.db.IDB;
import com.example.demo.db.LocalDb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
//    public static IDB db;
    public static ReportController reportController;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        db = new LocalDb();
//        db.init();

//        reportController = new ReportController();
    }

}
