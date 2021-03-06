package org.spring.shop.springecom.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.spring.shop.springecom.model.Order;
import org.spring.shop.springecom.model.Product;
import org.spring.shop.springecom.model.User;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	private List<Order> orders = new ArrayList<>();

	private List<Product> orderedProducts = new ArrayList<>();

	public List<Order> getOrders(String username) {
		return orders
		.stream()
		.filter(o -> o.getUser().getUsername().equals(username))
		.collect(Collectors.toList());
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(List<Product> products, User user){
		orders.add(createOrder(products, user));
	}

	public Order createOrder(List<Product> products, User user) {
		int total = 0;
		for (Product product : products)
			total += product.getPrice() * product.getCommand();
	
		return new Order(total, products, user);
	}

	public void updateOrder(Order order){
		orders.set(orders.indexOf(order), order);
	}

	public void removeOrder(Order order){
		orders.remove(order);
	}

	public void addToCard(Product product) {
		orderedProducts.add(product);
	}

	public void removeToCard(Product product){
		orderedProducts.remove(product);
	}

	public List<Product> getOrdered() {
		return orderedProducts;
	}
}
