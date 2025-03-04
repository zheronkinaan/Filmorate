package com.example.demo1.repositories;

import com.example.demo1.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
@Slf4j
public class UserRepositoriesImpl implements UserRepositories {

    private ArrayList<User> userArrayList = new ArrayList<>();

    public User create(User user) {
        log.info("входим в метод криэйт репозитория {}", user);
        userArrayList.add(user);
        log.info("выходим из метода криэйт репозитория {}", user);
        return user;
    }
}
