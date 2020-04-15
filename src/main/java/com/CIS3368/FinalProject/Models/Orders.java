package com.CIS3368.FinalProject.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="order")
public class Orders {

    @Id
    @Column(name="orderid")
    private String orderId;
    @Column(name="customerid")
    private String customerId;
    @Column(name="employeeid")
    private String employeeId;
    @Column(name="bookid")
    private String bookId;

    public Orders()
    {

    }

    public Orders(String orderId, String customerId, String employeeId, String bookId)
    {
        this.orderId = orderId;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.bookId = bookId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
