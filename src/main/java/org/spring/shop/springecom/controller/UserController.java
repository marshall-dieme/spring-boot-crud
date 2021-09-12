package org.spring.shop.springecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@SessionAttributes("user")
public class UserController {
    
    @GetMapping(value = "/")
    public String homepage(){
        return "homepage";
    }

    @GetMapping(value="/admin")
    public String admin() {
        return "products/list";
    }
    
}