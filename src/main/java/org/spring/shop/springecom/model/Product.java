package org.spring.shop.springecom.model;

import java.util.Objects;

public class Product {
    private static int ids = 0;
    private int id;
    private String name;
    private String make;
    private String model;
    private int price;
    private int stock;
    private int command;
    private String picture = "https://images.unsplash.com/photo-1484788984921-03950022c9ef?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDh8fGNvbXB1dGVyfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60";

    public Product() {
        this.id = ++ids;
    }

    public Product(String name, String make, String model, int price) {
        this.id = ++ids;
        this.name = name;
        this.make = make;
        this.model = model;
        this.price = price;
        this.stock = 10;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, make, model, price);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", make='" + getMake() + "'" +
            ", model='" + getModel() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }


    /**
     * @return int return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return int return the command
     */
    public int getCommand() {
        return command;
    }

    /**
     * @param command the command to set
     */
    public void setCommand(int command) {
        this.command = command;
    }


    /**
     * @return String return the picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @param picture the picture to set
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

}