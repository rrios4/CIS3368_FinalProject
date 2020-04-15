package com.CIS3368.FinalProject.controllers;
import com.CIS3368.FinalProject.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class MainController {

    @Autowired
    BooksRepo booksRepo;
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    OrdersRepo ordersRepo;




}
