package com.CIS3368.FinalProject.Controllers;

import com.CIS3368.FinalProject.Models.Customer;
import com.CIS3368.FinalProject.Models.CustomerRepo;
import com.CIS3368.FinalProject.Models.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;
import java.util.UUID;

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

    @RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("id") String id, @RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName,
                             @RequestParam("address") String address, @RequestParam("email") String email)
    {
        ModelAndView customerEdit = new ModelAndView("redirect:/CustomerView");
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

}
