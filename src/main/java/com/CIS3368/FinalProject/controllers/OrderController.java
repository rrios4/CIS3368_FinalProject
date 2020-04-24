package com.CIS3368.FinalProject.Controllers;

import com.CIS3368.FinalProject.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;
import java.util.UUID;

@Controller
public class OrderController {

    @Autowired
    private OrdersRepo ordersRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private order_bookRepo orderBookRepo;

    @Autowired
    private BooksRepo booksRepo;

    @RequestMapping("/orderView")
    public ModelAndView OrderView()
    {
        ModelAndView orderView = new ModelAndView("ordersView");
        orderView.addObject("orderList1", ordersRepo.findAll());
        return orderView;
    }

    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("orderid") String orderId,@RequestParam("orderdate") String orderDate, @RequestParam("ordertotal") String ordertotal, @RequestParam("employeeid") String employeeId,
                             @RequestParam("employeefirstname") String employeeFirstName, @RequestParam("employeelastname") String employeeLastName, @RequestParam("customerid") String customerId,
                             @RequestParam("firstname") String firstName,@RequestParam("lastname") String lastName,@RequestParam("bookid") String bookId,@RequestParam("bookname") String bookName,
                             @RequestParam("bookprice") String bookPrice,@RequestParam("order_bookid") String order_bookid,@RequestParam("bookqty") String bookqty) {
        ModelAndView ordersView = new ModelAndView("redirect:/orderView");
        Orders orderToSave;
        Employee employeeToSave;
        Customer customerToSave;
        Books bookToSave;
        order_book orderBookToSave;

            if(!orderId.isEmpty())
            {
                Optional<Orders> users3 = ordersRepo.findById(orderId);
                orderToSave = users3.get();
            }
            else {
                orderToSave = new Orders();
                orderToSave.setOrderId(UUID.randomUUID().toString());
            }

            if(!employeeId.isEmpty()){
             Optional<Employee> users4 = employeeRepo.findById(employeeId);
                employeeToSave = users4.get();

            }
            else{
                employeeToSave = new Employee();
                employeeToSave.setEmployeeId(UUID.randomUUID().toString());
            }
            if(!customerId.isEmpty()){
                Optional<Customer> users5 = customerRepo.findById(customerId);
                customerToSave = users5.get();
            }
            else{
                customerToSave =  new Customer();
                customerToSave.setCustomerId(UUID.randomUUID().toString());
            }
            if(!order_bookid.isEmpty()){
                Optional<order_book> users6 = orderBookRepo.findById(order_bookid);
                orderBookToSave = users6.get();
            }
            else{
                orderBookToSave = new order_book();
                orderBookToSave.setOrder_book_orderid(UUID.randomUUID().toString());
            }
            if(!bookId.equals(booksRepo.findById(bookId))){
                bookToSave = new Books();
                bookToSave.setBookName(bookName);
            }
            else if(!bookId.isEmpty()){
                Optional<Books> users7 = booksRepo.findById(bookId);
                bookToSave = users7.get();
            }
            else{
                bookToSave = new Books();
                bookToSave.setId(UUID.randomUUID().toString());
            }

            orderToSave.setOrderDate(orderDate);
            orderToSave.setOrderTotal(ordertotal);
            //bookToSave.setBookName(bookName);
            employeeToSave.setEmployeeFirstName(employeeFirstName);
            employeeToSave.setEmployeeLastName(employeeLastName);
            customerToSave.setFirstName(firstName);
            customerToSave.setLastName(lastName);
            orderBookToSave.setBookqty(bookqty);
            bookToSave.setBookPrice(bookPrice);

            ordersView.addObject("orderlist", ordersRepo.findAll());
            return ordersView;
    }



}


