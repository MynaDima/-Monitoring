package com.university.diploma.service;

import com.university.diploma.model.Base;

import java.util.List;

/**
 * Created by dima on 2/20/16.
 */
public interface MapService {

    List<Base> getByCoordinates(float lat, float lng);
}
