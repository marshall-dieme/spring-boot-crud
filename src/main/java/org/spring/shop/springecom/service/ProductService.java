package org.spring.shop.springecom.service;

import java.util.ArrayList;
import java.util.List;

import org.spring.shop.springecom.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("HP Spectre", "HP", "Spectre", 1200));
        products.add(new Product("HP Omen", "HP", "Omen", 995));
        products.add(new Product("MacBook Pro", "Apple", "MacBook", 1299));
        products.add(new Product("Asus Rogue", "Asus", "Rogue", 790));
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void updateProduct(Product product){
        products.set(products.indexOf(product), product);
    }

    public void updateProduct(Product product, String name, String make, String model, int price, int stock){
        product.setName(name);
        product.setMake(make);
        product.setModel(model);
        product.setPrice(price);
        product.setStock(stock);
        updateProduct(product);
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

    public void deleteProduct(int id) {
        products.remove(getProduct(id));
    }

}