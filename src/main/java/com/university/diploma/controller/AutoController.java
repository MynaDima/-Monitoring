package com.university.diploma.controller;

import com.university.diploma.model.Auto;
import com.university.diploma.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by dima on 2/11/16.
 */
@Controller
@RequestMapping("/")
public class AutoController {

    @Autowired
    AutoService autoService;

    @RequestMapping(value = "/autoParking", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Auto> autoParking() {
        List<Auto> autoList = autoService.getByType("автостоянки");
        return autoList;
    }

    @RequestMapping(value = "/fuelStation", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Auto> fuelStation() {
        List<Auto> autoList = autoService.getByType("АЗС");
        return autoList;
    }

    @RequestMapping(value = "/serviceStation", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Auto> serviceStation() {
        List<Auto> autoList = autoService.getByType("СТО и мойки");
        return autoList;
    }

}

