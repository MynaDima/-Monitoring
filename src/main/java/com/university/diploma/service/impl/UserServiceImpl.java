package com.university.diploma.service.impl;

import com.university.diploma.model.User;
import com.university.diploma.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by dima on 2/12/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("1234");

        return user;
    }

}