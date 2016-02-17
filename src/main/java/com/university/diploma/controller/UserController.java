package com.university.diploma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dima on 2/13/16.
 */
@Controller
@RequestMapping("/index")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String userPage(Model model){
        return "index";
    }
}
