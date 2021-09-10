package org.spring.shop.springecom.controller;

import org.spring.shop.springecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/list")
    public String list(ModelMap model){
        model.put("products", productService.getProducts());
        return "products/index";
    }

    @GetMapping(value = "/new")
    public String addProduct(){
        return "products/new";
    }

    @PostMapping(value = "/add")
    public String addProduct(@RequestParam String name, @RequestParam String make, @RequestParam String model, @RequestParam int price, @RequestParam int stock){
        productService.addProduct(productService.createProduct(name, make, model, price));
        return "redirect:list";
    }

    @GetMapping(value = "/edit/{id}")
    public String editProduct(@PathVariable int id, ModelMap model){
        model.put("product", productService.getProduct(id));
        return "products/new";
    }
    @PostMapping(value = "/edit/{id}")
    public String editProduct(@PathVariable int id, @RequestParam String name, @RequestParam String make, @RequestParam String model, @RequestParam int price, @RequestParam int stock){
        productService.updateProduct(productService.getProduct(id), name, make, model, price, stock);
        return "products/new";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
        return "redirect:list";
    }

    @GetMapping(value="/show/{id}")
    public String details(@PathVariable int id, ModelMap model) {
        model.put("product", productService.getProduct(id));
        return "products/show";
    }
    
    
}