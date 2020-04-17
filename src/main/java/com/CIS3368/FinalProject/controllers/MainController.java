package com.CIS3368.FinalProject.Controllers;
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

    @RequestMapping("/")
    public ModelAndView homePage()
    {
        ModelAndView home = new ModelAndView("mainMenu");
        home.addObject("list",booksRepo.findAll());

        return home;
    }

}
