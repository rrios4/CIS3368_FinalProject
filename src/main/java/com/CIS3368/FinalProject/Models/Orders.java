package com.CIS3368.FinalProject.Models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name="order_table")
public class Orders {

    @Id
    @Column(name="orderid")
    private String orderId;
    @Column(name="order_customerid", insertable = false, updatable = false)
    private String customerId;
    @Column(name="order_employeeid", insertable = false, updatable = false)
    private String employeeId;
    @Column(name = "orderdate")
    private String orderdate;
    @Column(name = "ordertotal")
    private String orderTotal;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_employeeid")
    private Employee emp;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_customerid")
    private Customer cust;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order_book")
    private Set<order_book> Order_Book = new HashSet<>();

/*    @OneToMany(targetEntity = order_book.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_bookid2", referencedColumnName = "bookid")
    private List<order_book> orderBook;*/

    public Orders()
    {

    }

    public Orders(String orderId, String customerId, String employeeId,String orderdate, String orderTotal)
    {
        this.orderId = orderId;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.orderdate = orderdate;
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
        return orderdate;
    }

    public void setOrderDate(String orderdate) {
        this.orderdate = orderdate;
    }
}
