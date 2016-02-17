package com.university.diploma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dima on 1/12/16.
 */
@Controller
@RequestMapping("/")
public class MapController {

    @RequestMapping(value = "/auto", method = RequestMethod.GET)
    public ModelAndView autoDiv() {

        ModelAndView modelAndView = new ModelAndView("auto");

        return modelAndView;
    }

}
