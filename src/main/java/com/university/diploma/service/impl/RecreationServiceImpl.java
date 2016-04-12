package com.university.diploma.service.impl;

import com.university.diploma.model.Recreation;
import com.university.diploma.repository.RecreationRepository;
import com.university.diploma.service.RecreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dima on 2/17/16.
 */
@Service
public class RecreationServiceImpl implements RecreationService {

    @Autowired
    private RecreationRepository recreationRepository;

    @Override
    public List<Recreation> getByType(String type) {
        return recreationRepository.getByType(type);
    }

}
