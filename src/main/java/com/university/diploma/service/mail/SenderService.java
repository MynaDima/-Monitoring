package com.university.diploma.service.mail;

import com.university.diploma.model.User;

import java.util.List;

/**
 * Created by dima on 09.04.16.
 */
public interface SenderService {

    public void send(User user);

    public void send(List<User> userList);

}
