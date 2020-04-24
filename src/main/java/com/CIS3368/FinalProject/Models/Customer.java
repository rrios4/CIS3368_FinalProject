package com.CIS3368.FinalProject.Models;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="customer_table")
public class Customer {
    @Id
    @Column(name="customerid")
    private String customerId;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
    @Column(name="address")
    private String address;
    @Column(name="email")
    private String email;

    //private String dob;
    @OneToMany(targetEntity = Orders.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_customerid",referencedColumnName = "customerid")
    private List<Orders> orders;

    public Customer()
    {

    }

    public Customer(String customerId, String firstName, String lastName, String address, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;

    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
