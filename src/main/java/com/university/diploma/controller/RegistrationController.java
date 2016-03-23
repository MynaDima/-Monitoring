package com.university.diploma.controller;

import com.github.scribejava.apis.FacebookApi;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.*;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.github.scribejava.core.oauth.OAuthService;
import com.university.diploma.model.User;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
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
