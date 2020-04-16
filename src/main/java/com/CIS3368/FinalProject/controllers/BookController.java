package com.CIS3368.FinalProject.Controllers;

import com.CIS3368.FinalProject.Models.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    @Autowired
    private BooksRepo bookRepo;
    @RequestMapping("/BookView")
    public ModelAndView BookView()
    {
        ModelAndView bookView = new ModelAndView("bookEdit");
        bookView.addObject("bookList1", bookRepo.findAll());
        return bookView;

    }
}
