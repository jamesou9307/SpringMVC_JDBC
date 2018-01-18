package com.james.springdemo.service;

import com.james.springdemo.dao.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityDao cityDao;

}
