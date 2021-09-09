package org.spring.shop.springecom.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Order {
    private static int ids = 0;
    private int id;
    private Date orderDate;
    private int total;
    private List<Product> products;
    private User user;
    private boolean delivered = false;

    public Order() {
        this.id = ++ids;
        this.orderDate = new Date();
    }

    public Order(int total, List<Product> products, User user) {
        this.id = ++ids;
        this.total = total;
        this.products = products;
        this.user = user;
        this.orderDate = new Date();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Order)) {
            return false;
        }
        Order order = (Order) o;
        return id == order.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, products);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", total='" + getTotal() + "'" +
            ", products='" + getProducts() + "'" +
            "}";
    }

    /**
     * @return Date return the orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * @return boolean return the delivered
     */
    public boolean isDelivered() {
        return delivered;
    }

    /**
     * @param delivered the delivered to set
     */
    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

}