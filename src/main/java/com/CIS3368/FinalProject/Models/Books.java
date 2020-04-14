package com.CIS3368.FinalProject.Models;

import java.util.UUID;

public class Books {

    private UUID bookId;
    private String bookName;
    private String authorName;
    private String bookType;
    private double bookPrice;
    private String qty;


    public UUID getId() {
        return bookId;
    }

    public void setId(UUID id) {
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

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
}