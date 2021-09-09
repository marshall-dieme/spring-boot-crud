package org.spring.shop.springecom.controller;

import org.spring.shop.springecom.model.User;
import org.spring.shop.springecom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class UserController {
    
    @Autowired
    UserService userService;

    @GetMapping(value = "/")
    public String login(){
        return "index";
    }

    @PostMapping(value = "/login")
    public String login(@RequestParam String username, @RequestParam String password, ModelMap model){
        User user = userService.loggedUser(username, password);
        
        if (user != null) {
            model.put("user", user);
            return "redirect:home";
        }

        model.put("credential", "invalid credentials ");
        return "index";
    }

    @GetMapping(value = "/home")
    public String homepage(){
        return "homepage";
    }
}