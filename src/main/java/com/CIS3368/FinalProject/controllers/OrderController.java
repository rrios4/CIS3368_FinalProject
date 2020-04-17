package com.CIS3368.FinalProject.Controllers;

import com.CIS3368.FinalProject.Models.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class OrderController {
    @Autowired
    private OrdersRepo ordersRepo;

    @RequestMapping("/orderView")
    public ModelAndView OrderView()
    {
        ModelAndView orderView = new ModelAndView("ordersView");
        orderView.addObject("orderList1", ordersRepo.findAll());
        return orderView;
    }

}


