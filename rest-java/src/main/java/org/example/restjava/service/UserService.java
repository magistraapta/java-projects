package org.example.restjava.service;

import org.example.restjava.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "mike", "mike@email.com", "123");

        userList.add(user1);
    }

    public Optional<User> getUser(Integer id) {

        Optional optional = Optional.empty();
        for (User user : userList) {
            if (user.getId() == 1) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
