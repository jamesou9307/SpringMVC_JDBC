package com.james.springdemo.service;

import com.james.springdemo.dao.CityDao;
import com.james.springdemo.dao.CountryDao;
import com.james.springdemo.entity.City;
import com.james.springdemo.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    private CountryDao countryDao;

    @Autowired
    private CityDao cityDao;

    @Override
    public Country getCountryInfo(String countryCode) {

        Country country=new Country();

        country=countryDao.queryCountry(countryCode);
        List<City> cities=cityDao.queryAllCities(countryCode);
        country.setCities(cities);

        return country;
    }
}
