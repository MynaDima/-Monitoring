package com.university.diploma.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.university.diploma.model.User;

/**
 * Created by dima on 2/12/16.
 */

public interface UserService {

    User getIdByName(String name);

    User getUserBySocialId(String id);

    User addUserBySocialAuth(String name, String socialId, String email);

    User addUser(User user);

}
