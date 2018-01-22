package com.james.springdemo.service;

import com.james.springdemo.dao.CityDao;
import com.james.springdemo.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiryServiceImpl implements CityService{

    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> getAllCity(String countryCode) {

        return cityDao.queryAllCities(countryCode);
    }
}
