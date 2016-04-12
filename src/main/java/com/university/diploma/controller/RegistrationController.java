package com.university.diploma.controller;

import com.university.diploma.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

/**
 * Created by dima on 3/6/16.
 */

@Controller
@RequestMapping("/")
public class RegistrationController {

    private Logger logger = Logger.getLogger(String.valueOf(UserController.class));

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView setUpRegistration() {
        ModelAndView modelAndView = new ModelAndView("registration");
        return modelAndView;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addStudent(User user) {

        logger.info(user.toString());
    }
}
