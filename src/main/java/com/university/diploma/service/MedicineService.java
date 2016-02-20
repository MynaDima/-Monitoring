package com.university.diploma.service;

import com.university.diploma.model.Medicine;

import java.util.List;

/**
 * Created by dima on 2/17/16.
 */
public interface MedicineService {

    List<Medicine> getByType(String type);

}
