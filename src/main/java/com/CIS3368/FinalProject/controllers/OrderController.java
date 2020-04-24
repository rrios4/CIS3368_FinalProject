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

    @RequestMapping("/orderView")
    public ModelAndView OrderView()
    {
        ModelAndView orderView = new ModelAndView("ordersView");
        orderView.addObject("orderList1", ordersRepo.findAll());
        return orderView;
    }

    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("orderid") String orderId,@RequestParam("orderdate") String orderdate, @RequestParam("ordertotal") String ordertotal, @RequestParam("employeeid") String employeeId,
                             @RequestParam("employeefirstname") String employeeFirstName, @RequestParam("employeelastname") String employeeLastName, @RequestParam("customerid") String customerId,
                             @RequestParam("firstname") String firstName,@RequestParam("lastname") String lastName,@RequestParam("bookid") String bookId,@RequestParam("bookname") String bookName,
                             @RequestParam("bookprice") String bookPrice,@RequestParam("bookqty") String bookqty)
    {
        ModelAndView ordersView = new ModelAndView("redirect:/orderView");
        Orders orderToSave;
        Employee employeeToSave;
        Customer customerToSave;
        Books bookToSave;
        if(!orderId.isEmpty())
        {
            Optional<Orders> users3 = ordersRepo.findById(orderId);
            orderToSave = users3.get();
        }
        else if(!employeeId.isEmpty()){
            Optional<Employee> users4 = employeeRepo.findById(employeeId);
            employeeToSave = users4.get();

        }
        else if(!customerId.isEmpty()){
            Optional<Customer> users5 = customerRepo.findById(customerId);
            customerToSave = users5.get();

        }
        else
        {
            orderToSave = new Orders();
            orderToSave.setOrderId(UUID.randomUUID().toString());
            employeeToSave = new Employee();
            employeeToSave.setEmployeeId(UUID.randomUUID().toString());
            customerToSave =  new Customer();
            customerToSave.setCustomerId(UUID.randomUUID().toString());
        }

        ordersView.addObject("orderlist", ordersRepo.findAll());
        return ordersView;
    }



}


