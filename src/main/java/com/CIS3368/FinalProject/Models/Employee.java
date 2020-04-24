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
    @Column(name="payrate")
    private String payRate;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zipcode")
    private String zipcode;
    @Column(name="email")
    private String email;



/*    @OneToMany(targetEntity = Orders.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_employeeid", referencedColumnName = "employeeid")
    private List<Orders> orders;*/

    public Employee()
    {

    }

    public Employee(String employeeId, String employeeFirstName, String employeeLastName, String position, String payRate, String address,
                    String city, String state, String zipcode, String email)
    {
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.position = position;
        this.payRate = payRate;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.email = email;
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

    public String getPayRate() {
        return payRate;
    }

    public void setPayRate(String payRate) {
        this.payRate = payRate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
