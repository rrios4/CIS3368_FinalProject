package com.CIS3368.FinalProject.Models;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @Column(name="employeeid")
    private String employeeId;
    @Column(name="employeefirstname")
    private String employeeFirstName;
    @Column(name="employeelastname")
    private String employeeLastName;
    @Column(name="position")
    private String position;

    @OneToMany(targetEntity = Orders.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_employeeid", referencedColumnName = "employeeid")
    private List<Orders> orders;

    public Employee()
    {

    }

    public Employee(String employeeId, String employeeFirstName, String employeeLastName, String position)
    {
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.position = position;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
