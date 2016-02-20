package com.university.diploma.controller;

import com.university.diploma.model.Base;
import com.university.diploma.model.Coordinates;
import com.university.diploma.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by dima on 1/12/16.
 */
@Controller
@RequestMapping("/")
public class MapController {

    @Autowired
    MapService mapService;

    List<Base> dataList;

    private Logger logger = Logger.getLogger(String.valueOf(MapController.class));

    @RequestMapping(value = "/auto", method = RequestMethod.GET)
    public ModelAndView autoDiv() {

        ModelAndView modelAndView = new ModelAndView("auto");

        return modelAndView;
    }


//    @RequestMapping(value = "/monitorCoordinates", method = RequestMethod.POST, headers = {"Content-type=application/json"})
//    @ResponseBody
//    public void monitorCoordinates(@RequestBody Coordinates coordinates){
//        dataList = mapService.getByCoordinates(coordinates.getLat(),coordinates.getLng());
//        logger.info(dataList.get(1).getAddress());
//    }

    @RequestMapping(value = "/monitorCoordinates", method = RequestMethod.POST, headers = {"Content-type=application/json"})
    @ResponseBody
    public List<Base> monitorCoordinates(@RequestBody Coordinates coordinates){
        dataList = mapService.getByCoordinates(coordinates.getLat(),coordinates.getLng());
        logger.info(dataList.get(1).getAddress());
        return dataList;
    }

    @RequestMapping(value="/dataCoordinates", method = RequestMethod.GET)
    @ResponseBody
    public List<Base> coordinatesData() {
        return dataList;
    }

}
