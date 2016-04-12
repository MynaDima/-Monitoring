package com.university.diploma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by dima on 2/10/16.
 */
@Controller
@RequestMapping("/")
public class FAQController {

    @RequestMapping(value = "/#faq", method = RequestMethod.GET)
    public ModelAndView homeMap() {

        ModelAndView modelAndView = new ModelAndView("faq");

        return modelAndView;
    }


}
