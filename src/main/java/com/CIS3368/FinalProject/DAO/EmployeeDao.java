package com.CIS3368.FinalProject.DAO;

import com.CIS3368.FinalProject.Models.Employee;

public interface EmployeeDao {
    void insertEmployee(Employee worker);

    void deleteEmployeeById(String employeeId);
}
