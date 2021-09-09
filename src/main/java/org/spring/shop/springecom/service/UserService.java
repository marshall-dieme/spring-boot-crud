package org.spring.shop.springecom.service;

import java.util.ArrayList;
import java.util.List;

import org.spring.shop.springecom.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "marshall", "dieme", "ADMIN", new ArrayList<>()));
        users.add(new User(2, "jeenabee", "mima", "CUSTOMER", new ArrayList<>()));
    }

    public User loggedUser(String username, String password){
        User user = null;
        for (User u : users) {
            if (u.getUsername().equalsIgnoreCase(username) && u.getPassword().equalsIgnoreCase(password)) {
                user = u;
            }
        }
        return user;
    }
}