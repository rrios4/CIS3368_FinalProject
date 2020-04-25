package com.CIS3368.FinalProject.Services;

import com.CIS3368.FinalProject.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrdersRepo ordersRepo;
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private BooksRepo booksRepo;
    @Autowired
    private order_bookRepo orderBookRepo;

    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        employeeRepo.findAll()
                .forEach(employees::add);
            return employees;
    }
    public List<Customer> getAllCustomers(){
        List<Customer> customers = new ArrayList<>();
        customerRepo.findAll()
                .forEach(customers::add);
        return customers;
    }
    public List<Books> getAllBooks(){
        List<Books> books = new ArrayList<>();
        booksRepo.findAll()
                .forEach(books::add);
        return books;
    }
    public List<order_book> getAllQty(){
        List<order_book> order_books = new ArrayList<>();
        for(order_book orderBook : orderBookRepo.findAll()){
            order_books.add(orderBook);
        }
        return order_books;
    }
}
