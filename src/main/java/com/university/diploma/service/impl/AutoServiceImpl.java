package com.university.diploma.service.impl;


import com.university.diploma.model.Auto;
import com.university.diploma.repository.AutoRepository;
import com.university.diploma.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dima on 1/7/16.
 */
@Service
public class AutoServiceImpl implements AutoService {

    @Autowired
    private AutoRepository autoRepository;

    public List<Auto> getAll() {
        return autoRepository.findAll();
    }

    @Override
    public List<Auto> getByType(String type) {
        return autoRepository.getByType(type);
    }

    @Override
    public List<Auto> getByAddress() {
        return null;
    }
}
