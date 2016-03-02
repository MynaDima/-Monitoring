package com.university.diploma.service.impl;

import com.university.diploma.model.User;
import com.university.diploma.repository.UserRepository;
import com.university.diploma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dima on 3/2/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getIdByName(String name) {
        return userRepository.getUserIdByName(name);
    }
}
