package com.CIS3368.FinalProject.Models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee, String> {

    /*String joinSQL = "SELECT FROM Employee";
    @Query(joinSQL)
    Collection<Employee> getAllOrderInfo();*/

}
