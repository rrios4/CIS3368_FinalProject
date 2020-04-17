package com.CIS3368.FinalProject.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="order_table")
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
    @Column(name = "orderdate")
    private String orderDate;
    @Column(name = "ordertotal")
    private String orderTotal;

    public Orders()
    {

    }

    public Orders(String orderId, String customerId, String employeeId, String bookId, String orderTotal)
    {
        this.orderId = orderId;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.bookId = bookId;
        this.orderTotal = orderTotal;
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

    public String getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}
