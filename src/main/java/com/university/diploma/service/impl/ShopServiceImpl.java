package com.university.diploma.service.impl;

import com.university.diploma.model.Shop;
import com.university.diploma.repository.ShopRepository;
import com.university.diploma.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dima on 2/17/16.
 */
@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopRepository shopRepository;


    @Override
    public List<Shop> getByType(String type) {
        return shopRepository.getByType(type);
    }
}
