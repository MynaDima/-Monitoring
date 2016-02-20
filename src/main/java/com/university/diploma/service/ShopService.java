package com.university.diploma.service;

import com.university.diploma.model.Shop;

import java.util.List;

/**
 * Created by dima on 2/17/16.
 */
public interface ShopService {

    List<Shop> getByType(String type);
}
