package com.CIS3368.FinalProject.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="book")
public class Books {

    @Id
    @Column(name="bookid")
    private String bookId;
    @Column(name="bookname")
    private String bookName;
    @Column(name="authorname")
    private String authorName;
    @Column(name="publisher")
    private String publisher;
    @Column(name="bookprice")
    private String bookPrice;
    @Column(name="qty")
    private String qty;

    public Books()
    {

    }

    public Books(String bookId, String bookName, String authorName, String publisher, String bookPrice, String qty)
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisher = publisher;
        this.bookPrice = bookPrice;
        this.qty = qty;

    }


    public String getId() {
        return bookId;
    }

    public void setId(String id) {
        this.bookId = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
}