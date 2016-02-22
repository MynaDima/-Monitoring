package com.university.diploma.service;

import com.university.diploma.model.Base;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by dima on 2/20/16.
 */
public interface MapService {

    List<Base> getByCoordinate(float lat, float lng) throws SQLException, ClassNotFoundException;


}
