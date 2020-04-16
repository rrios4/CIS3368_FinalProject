package com.CIS3368.FinalProject.Controllers;

import com.CIS3368.FinalProject.Models.CustomerRepo;
import com.CIS3368.FinalProject.Models.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @RequestMapping("/CustomerView")
    public ModelAndView CustomerView()
    {
        ModelAndView customerView = new ModelAndView("customerEdit");
        customerView.addObject("customerList1", customerRepo.findAll());
        return customerView;
    }

}
