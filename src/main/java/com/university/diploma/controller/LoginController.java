package com.university.diploma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dima on 2/12/16.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String loginPage(Model model){
        return "login";
    }



}