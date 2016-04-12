package com.university.diploma.service.impl;

import com.sun.org.apache.xpath.internal.operations.Bool;
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

    @Override
    public User getUserBySocialId(String id) {
        return userRepository.getUserBySocialId(id);
    }

    @Override
    public User addUserBySocialAuth(String name, String socialId, String email) {
        return userRepository.addSocialUser(name, email,socialId);
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }



}
