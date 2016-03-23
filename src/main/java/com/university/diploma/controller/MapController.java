package com.university.diploma.controller;

import com.university.diploma.model.Base;
import com.university.diploma.model.Coordinates;
import com.university.diploma.model.PollutionPlace;
import com.university.diploma.service.MapService;
import com.university.diploma.service.PollutionPlaceService;
import com.university.diploma.service.impl.MapServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
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

    @Autowired
    PollutionPlaceService pollutionPlaceService;

    private Logger logger = Logger.getLogger(String.valueOf(MapController.class));

    @RequestMapping(value = "/auto", method = RequestMethod.GET)
    public ModelAndView autoDiv() {

        ModelAndView modelAndView = new ModelAndView("auto");

        return modelAndView;
    }

    @RequestMapping(value = "/monitorCoordinates", method = RequestMethod.POST, headers = {"Content-type=application/json"})
    @ResponseBody
    public List<Base> monitorCoordinates(@RequestBody Coordinates coordinates) throws SQLException, ClassNotFoundException {
        logger.info(coordinates.toString());
        List<Base> dataList = mapService.getByCoordinate((float) coordinates.getLat(), (float) coordinates.getLng());
        logger.info(String.valueOf(dataList.size()));
        return dataList;
    }

    @RequestMapping(value = "/getPollutionPlace", method = RequestMethod.GET)
    @ResponseBody
    public List<PollutionPlace> getPollutionPlaces() {
        List<PollutionPlace> pollutionPlacesList = pollutionPlaceService.getAllPollution();
        return pollutionPlacesList;
    }


}
