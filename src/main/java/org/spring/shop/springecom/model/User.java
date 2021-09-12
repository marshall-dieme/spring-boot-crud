package org.spring.shop.springecom.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private int id;
    private String username;
    private String password;
    private String profil;
    private List<Order> orders;
    private List<Product> ordered = new ArrayList<>();

    public User() {
    }

    public User(int id, String username, String password, String profil, List<Order> orders) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.profil = profil;
        this.orders = orders;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfil() {
        return this.profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public List<Order> getOrders() {
        return this.orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public User id(int id) {
        setId(id);
        return this;
    }

    public User username(String username) {
        setUsername(username);
        return this;
    }

    public User password(String password) {
        setPassword(password);
        return this;
    }

    public User profil(String profil) {
        setProfil(profil);
        return this;
    }

    public User orders(List<Order> orders) {
        setOrders(orders);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, profil, orders);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", profil='" + getProfil() + "'" +
            ", orders='" + getOrders() + "'" +
            "}";
    }

    /**
     * @return List<Product> return the ordered
     */
    public List<Product> getOrdered() {
        return ordered;
    }

    /**
     * @param ordered the ordered to set
     */
    public void setOrdered(List<Product> ordered) {
        this.ordered = ordered;
    }

    public void addProduct(Product p){
        boolean find = false;
        for (Product product : ordered) {
            if (product.equals(p)) {
                find = true;
                product.setCommand(product.getCommand()+1);
                break;
            }
        }
        if (!find) {
            p.setCommand(p.getCommand()+1);
            this.ordered.add(p);
        }
    }

    public void removeProduct(Product product) {
        ordered.remove(product);
    }

}