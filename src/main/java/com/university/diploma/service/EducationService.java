package com.university.diploma.service;
import com.university.diploma.model.Education;

import java.util.List;

/**
 * Created by dima on 2/17/16.
 */
public interface EducationService {

    List<Education> getByType(String type);
}
