package com.CIS3368.FinalProject.controllers;
import com.CIS3368.FinalProject.Models.Books;
import com.CIS3368.FinalProject.Models.BooksRepo;
import com.CIS3368.FinalProject.Models.Customer;
import com.CIS3368.FinalProject.Models.CustomerRepo;
import com.CIS3368.FinalProject.Models.Employee;
import com.CIS3368.FinalProject.Models.EmployeeRepo;
import com.CIS3368.FinalProject.Models.Orders;
import com.CIS3368.FinalProject.Models.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;
import java.util.UUID;


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

    @RequestMapping("/")
    public ModelAndView homePage()
    {
        ModelAndView home = new ModelAndView("index");
        home.addObject("list",booksRepo.findAll());

        return home;
    }

    @RequestMapping(value = "/saveBook", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("bookid") String bookId, @RequestParam("bookname") String bookName, @RequestParam("authorname") String authorName,
                             @RequestParam("booktype") String bookType, @RequestParam("bookprice") String bookPrice, @RequestParam("qty") String qty )
    {
        ModelAndView bookEdit = new ModelAndView("redirect:/");
        Books bookToSave ;
        if(!bookId.isEmpty())
        {
            Optional<Books> users = booksRepo.findById(bookId);
            bookToSave = users.get();
        }
        else
        {
            bookToSave = new Books();
            bookToSave.setId(UUID.randomUUID().toString());
        }
        bookToSave.setAuthorName(authorName);
        bookToSave.setBookName(bookName);
        bookToSave.setBookType(bookType);
        bookToSave.setBookPrice(bookPrice);
        bookToSave.setQty(qty);
        booksRepo.save(bookToSave);
        bookEdit.addObject("booklist", booksRepo.findAll());
        return bookEdit;
    }

    @RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("id") String id, @RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName,
                             @RequestParam("address") String address, @RequestParam("email") String email)
    {
        ModelAndView customerEdit = new ModelAndView("redirect:/");
        Customer customerToSave ;
        if(!id.isEmpty())
        {
            Optional<Customer> users2 = customerRepo.findById(id);
            customerToSave = users2.get();
        }
        else
        {
            customerToSave = new Customer();
            customerToSave.setId(UUID.randomUUID().toString());
        }
        customerToSave.setFirstName(firstName);
        customerToSave.setLastName(lastName);
        customerToSave.setAddress(address);
        customerToSave.setEmail(email);
        customerRepo.save(customerToSave);
        customerEdit.addObject("customerlist", customerRepo.findAll());
        return customerEdit;
    }

    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("employeeid") String employeeId, @RequestParam("employeefirstname") String employeeFirstName, @RequestParam("employeelastname") String employeeLastName,
                             @RequestParam("position") String position)
    {
        ModelAndView employeeEdit = new ModelAndView("redirect:/");
        Employee employeeToSave;
        if(!employeeId.isEmpty())
        {
            Optional<Employee> users3 = employeeRepo.findById(employeeId);
            employeeToSave = users3.get();
        }
        else
        {
            employeeToSave = new Employee();
            employeeToSave.setEmployeeId(UUID.randomUUID().toString());
        }
        employeeToSave.setEmployeeFirstName(employeeFirstName);
        employeeToSave.setEmployeeLastName(employeeLastName);
        employeeToSave.setPosition(position);
        employeeRepo.save(employeeToSave);
        employeeEdit.addObject("employeelist", employeeRepo.findAll());
        return employeeEdit;
    }






}
