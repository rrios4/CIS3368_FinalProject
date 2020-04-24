package com.CIS3368.FinalProject.Models;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.*;
import java.util.List;
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

/*    @OneToMany(targetEntity = order_book.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_bookid", referencedColumnName = "bookid")
    private List<order_book> orderBooks;*/

    public Books()
    {

    }

    public Books(String bookId, String bookName, String authorName, String publisher, String bookPrice)
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisher = publisher;
        this.bookPrice = bookPrice;


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


}