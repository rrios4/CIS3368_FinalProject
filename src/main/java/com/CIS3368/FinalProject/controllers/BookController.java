package com.CIS3368.FinalProject.Controllers;

import com.CIS3368.FinalProject.Models.Books;
import com.CIS3368.FinalProject.Models.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;
import java.util.UUID;

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

    @RequestMapping(value = "/saveBook", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("bookid") String bookId, @RequestParam("bookname") String bookName,
                             @RequestParam("authorname") String authorName,
                             @RequestParam("publisher") String publisher,
                             @RequestParam("bookprice") String bookPrice )
    {
        ModelAndView bookEdit = new ModelAndView("redirect:/BookView");
        Books bookToSave ;
        if(!bookId.isEmpty())
        {
            Optional<Books> users = bookRepo.findById(bookId);
            bookToSave = users.get();
        }
        else
        {
            bookToSave = new Books();
            bookToSave.setId(UUID.randomUUID().toString());
        }
        bookToSave.setAuthorName(authorName);
        bookToSave.setBookName(bookName);
        bookToSave.setPublisher(publisher);
        bookToSave.setBookPrice(bookPrice);
        bookRepo.save(bookToSave);
        bookEdit.addObject("booklist", bookRepo.findAll());
        return bookEdit;
    }

    @RequestMapping( value = "/delete/{bookid}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("bookid") String bookId){
        ModelAndView deleteBook = new ModelAndView("redirect:/BookView");
        bookRepo.deleteById(bookId);
        return deleteBook;
    }


}
