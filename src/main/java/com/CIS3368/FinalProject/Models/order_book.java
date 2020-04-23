package com.CIS3368.FinalProject.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="order_book")
public class order_book {

    @Id
    @Column(name = "orderid")
    private String order_book_orderid;
    @Id
    @Column(name = "bookid")
    private String order_book_bookid;
    @Column(name = "bookqty")
    private String bookqty;

    public order_book(){

    }

    public order_book(String order_book_orderid, String order_book_bookid, String bookqty)
    {
        this.order_book_orderid = order_book_orderid;
        this.order_book_bookid = order_book_bookid;
        this.bookqty = bookqty;


    }


    public String getOrder_book_orderid() {
        return order_book_orderid;
    }

    public void setOrder_book_orderid(String order_book_orderid) {
        this.order_book_orderid = order_book_orderid;
    }

    public String getOrder_book_bookid() {
        return order_book_bookid;
    }

    public void setOrder_book_bookid(String order_book_bookid) {
        this.order_book_bookid = order_book_bookid;
    }

    public String getBookqty() {
        return bookqty;
    }

    public void setBookqty(String bookqty) {
        this.bookqty = bookqty;
    }
}
