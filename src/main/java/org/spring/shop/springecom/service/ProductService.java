package org.spring.shop.springecom.service;

import java.util.ArrayList;
import java.util.List;

import org.spring.shop.springecom.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private static List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void updateProduct(Product product){
        products.set(products.indexOf(product), product);
    }

    public Object getProducts() {
        return products;
    }

    public Product createProduct(String name, String make, String model, int price) {
        return new Product(name, make, model, price);
    }

    public Product getProduct(int id) {
        Product p = null;
        for (Product product : products) {
            if (product.getId() == id) {
                p = product;
            }
        }
        return p;
    }

}