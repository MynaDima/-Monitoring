package com.university.diploma.service;

import com.university.diploma.model.Sport;

import java.util.List;

/**
 * Created by dima on 2/17/16.
 */
public interface SportService {
    List<Sport> getByType(String type);
}
