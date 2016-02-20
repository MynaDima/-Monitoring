package com.university.diploma.service.impl;

import com.university.diploma.model.Base;
import com.university.diploma.repository.MapRepository;
import com.university.diploma.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dima on 2/20/16.
 */
@Service
public class MapServiceImpl implements MapService {

    @Autowired
    private MapRepository mapRepository;

    @Override
    public List<Base> getByCoordinates(float lat, float lng) {
        return mapRepository.getBaseCoordinates(lat, lng);
    }
}
