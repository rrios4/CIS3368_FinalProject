package com.CIS3368.FinalProject.Controllers;

import com.CIS3368.FinalProject.Models.Employee;
import com.CIS3368.FinalProject.Models.EmployeeRepo;
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

    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("employeeid") String employeeId, @RequestParam("employeefirstname") String employeeFirstName,
                             @RequestParam("employeelastname") String employeeLastName, @RequestParam("position") String position,
                             @RequestParam("payrate") String payRate, @RequestParam("address") String address,
                             @RequestParam("city") String city, @RequestParam("state") String state, @RequestParam("zipcode") String zipcode,
                             @RequestParam("email") String email)
    {
        ModelAndView employeeEdit = new ModelAndView("redirect:/EmployeeView");
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
        employeeToSave.setPayRate(payRate);
        employeeToSave.setAddress(address);
        employeeToSave.setCity(city);
        employeeToSave.setState(state);
        employeeToSave.setZipcode(zipcode);
        employeeToSave.setEmail(email);
        employeeRepo.save(employeeToSave);
        employeeEdit.addObject("employeelist", employeeRepo.findAll());
        return employeeEdit;
    }


}
