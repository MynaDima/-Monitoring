package com.university.diploma.controller;

import com.university.diploma.model.Education;
import com.university.diploma.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by dima on 2/17/16.
 */
@Controller
@RequestMapping("/")
public class EducationController {

    @Autowired
    EducationService educationService;

    @RequestMapping(value="/library", method = RequestMethod.GET)
    public @ResponseBody
    List<Education> library() {
        List<Education> educationList = educationService.getByType("библиотеки");
        return educationList;
    }

    @RequestMapping(value="/highSchool", method = RequestMethod.GET)
    public @ResponseBody
    List<Education> highSchool() {
        List<Education> educationList = educationService.getByType("ВУЗы");
        return educationList;
    }

    @RequestMapping(value="/playSchool", method = RequestMethod.GET)
    public @ResponseBody
    List<Education> playSchool() {
        List<Education> educationList = educationService.getByType("детские сады");
        return educationList;
    }

    @RequestMapping(value="/boardingSchool", method = RequestMethod.GET)
    public @ResponseBody
    List<Education> boardingSchool() {
        List<Education> educationList = educationService.getByType("интернаты");
        return educationList;
    }

    @RequestMapping(value="/ptu", method = RequestMethod.GET)
    public @ResponseBody
    List<Education> ptu() {
        List<Education> educationList = educationService.getByType("колледжи, ПТУ и техникумы");
        return educationList;
    }

    @RequestMapping(value="/sportSchool", method = RequestMethod.GET)
    public @ResponseBody
    List<Education> sportSchool() {
        List<Education> educationList = educationService.getByType("спортивные школы");
        return educationList;
    }

    @RequestMapping(value="/school", method = RequestMethod.GET)
    public @ResponseBody
    List<Education> school() {
        List<Education> educationList = educationService.getByType("школы, гимназии и лицеи");
        return educationList;
    }

    @RequestMapping(value="/artschool", method = RequestMethod.GET)
    public @ResponseBody
    List<Education> artSchool() {
        List<Education> educationList = educationService.getByType("школы искусств");
        return educationList;
    }


}
