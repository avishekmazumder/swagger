package com.tiaa.swaggerexample.dataacess;

import com.tiaa.swaggerexample.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Avishek on 16-Mar-18.
 */
@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static  int userCount = 3;
    static {
        users.add(new User(1,"Jason"));
        users.add(new User(2,"Johnny"));
        users.add(new User(3,"Jack"));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if(null == user.getId()) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
