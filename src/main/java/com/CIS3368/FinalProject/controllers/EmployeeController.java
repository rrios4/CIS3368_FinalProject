package com.CIS3368.FinalProject.Controllers;

import com.CIS3368.FinalProject.Models.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @RequestMapping("/EmployeeView")
    public ModelAndView employeeView()
    {
        ModelAndView employeeView = new ModelAndView("employeeEdit");
        employeeView.addObject("employeeList1", employeeRepo.findAll());
        return employeeView;
    }
}
