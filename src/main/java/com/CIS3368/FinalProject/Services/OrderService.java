package com.CIS3368.FinalProject.Services;

import com.CIS3368.FinalProject.Models.Employee;
import com.CIS3368.FinalProject.Models.EmployeeRepo;
import com.CIS3368.FinalProject.Models.OrdersRepo;
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

    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        employeeRepo.findAll()
                .forEach(employees::add);
            return employees;


    }
}
