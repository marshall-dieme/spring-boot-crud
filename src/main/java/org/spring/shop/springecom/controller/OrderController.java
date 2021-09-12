package org.spring.shop.springecom.controller;


import javax.servlet.http.HttpServletRequest;

import org.spring.shop.springecom.model.User;
import org.spring.shop.springecom.service.OrderService;
import org.spring.shop.springecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/orders")
@SessionAttributes("user")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    ProductService productService;

    @GetMapping(value = "/list")
    public String getUserOrders(ModelMap model){
        User user = (User) model.get("user");
        if (user.getProfil().equalsIgnoreCase("admin")) {
            model.put("orders", orderService.getOrders());
        } else {
            model.put("orderedProducts", orderService.getOrdered());
            model.put("orders", orderService.getOrders(user.getUsername()));
        }
        return "orders/index";
    }

    @GetMapping(value = "/add/{id}")
    public String addToCard(HttpServletRequest request, @PathVariable int id, ModelMap model){
        User user = (User) model.get("user");
        user.addProduct(productService.getProduct(id));
        model.put("user", user);
        return "redirect:" + request.getHeader("Referer");
    }


    public String removeOrder(HttpServletRequest request, @PathVariable int id, ModelMap model) {
        User user = (User) model.get("user");
        user.removeProduct(productService.getProduct(id));
        model.put("user", user);
        return "redirect:" + request.getHeader("Referer");
    }
}