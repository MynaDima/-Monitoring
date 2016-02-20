package com.university.diploma.service;

import com.university.diploma.model.Recreation;

import java.util.List;

/**
 * Created by dima on 2/17/16.
 */
public interface RecreationService {

    List<Recreation> getByType(String type);
}
