package com.university.diploma.service.impl;

import com.university.diploma.model.Education;
import com.university.diploma.repository.EducationRepository;
import com.university.diploma.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dima on 2/17/16.
 */
@Service
public class EducationServiceImpl implements EducationService {

    @Autowired
    private EducationRepository educationRepository;


    @Override
    public List<Education> getByType(String type) {
        return educationRepository.getByType(type);
    }
}
