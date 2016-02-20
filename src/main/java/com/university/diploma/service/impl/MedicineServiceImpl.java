package com.university.diploma.service.impl;

import com.university.diploma.model.Medicine;
import com.university.diploma.repository.MedicineRepository;
import com.university.diploma.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dima on 2/17/16.
 */
@Service
public class MedicineServiceImpl implements MedicineService{

    @Autowired
    private MedicineRepository medicineRepository;

    @Override
    public List<Medicine> getByType(String type) {
        return medicineRepository.getByType(type);
    }

}
