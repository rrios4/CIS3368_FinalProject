package com.CIS3368.FinalProject.Models;


import javax.persistence.*;
import java.util.List;


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
    @Column(name = "orderdate")
    private String orderDate;
    @Column(name = "ordertotal")
    private String orderTotal;

    @OneToMany(targetEntity = order_book.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_bookid2", referencedColumnName = "bookid")
    private List<order_book> orderBook;

    public Orders()
    {

    }

    public Orders(String orderId, String customerId, String employeeId, String orderTotal)
    {
        this.orderId = orderId;
        this.customerId = customerId;
        this.employeeId = employeeId;
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
