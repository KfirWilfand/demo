package com.example.demo;

import com.example.demo.controller.ReportController;
import com.example.demo.db.IDB;
import com.example.demo.db.LocalDb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static final String DUMMY_EMP = "/rest/emp/dummy";
    public static final String GET_EMP = "/rest/emp/{id}";
    public static final String GET_ALL_EMP = "/rest/emps";
    public static final String CREATE_EMP = "/rest/emp/create";
    public static final String DELETE_EMP = "/rest/emp/delete/{id}";
//    public static IDB db;
    public static ReportController reportController;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        db = new LocalDb();
//        db.init();

//        reportController = new ReportController();
    }

}
