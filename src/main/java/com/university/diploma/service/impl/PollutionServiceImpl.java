package com.university.diploma.service.impl;

import com.university.diploma.model.PollutionPlace;
import com.university.diploma.repository.PollutionRepository;
import com.university.diploma.service.PollutionPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dima on 3/21/16.
 */
@Service
public class PollutionServiceImpl implements PollutionPlaceService{

    @Autowired
    PollutionRepository pollutionRepository;

    @Override
    public List<PollutionPlace> getAllPollution() {
        return pollutionRepository.findAll();
    }

}
