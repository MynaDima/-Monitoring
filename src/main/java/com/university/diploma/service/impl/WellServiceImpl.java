package com.university.diploma.service.impl;

import com.university.diploma.model.Well;
import com.university.diploma.repository.WellRepository;
import com.university.diploma.service.WellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dima on 2/17/16.
 */
@Service
public class WellServiceImpl implements WellService{

    @Autowired
    private WellRepository wellRepository;

    public List<Well> getAll(){
        return wellRepository.findAll();
    }


}
