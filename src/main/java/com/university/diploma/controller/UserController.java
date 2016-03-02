package com.university.diploma.controller;

import com.university.diploma.model.User;
import com.university.diploma.model.UserSettings;
import com.university.diploma.service.UserService;
import com.university.diploma.service.UserSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

/**
 * Created by dima on 3/1/16.
 */
@Controller
public class UserController {

    private Logger logger = Logger.getLogger(String.valueOf(UserController.class));

    @Autowired
    UserSettingsService userSettingsService;

    @Autowired
    UserService userService;


    @RequestMapping(value="/getUserSettings", method = RequestMethod.GET)
    public UserSettings getUserSettings(){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        logger.info(name);

        User user = userService.getIdByName(name);
        Integer id = user.getId();
        logger.info(String.valueOf(id));

        UserSettings userSettings = new UserSettings();
        userSettings.setId(id);
        userSettings.setBouling(true);
        userSettingsService.setUserSettings(userSettings);
        return userSettings;
    }

}
