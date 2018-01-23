package com.james.springdemo.dao;

import com.james.springdemo.entity.Country;

import java.util.List;

public interface CountryDao {

    Country queryCountry(String countryCode);
    List<Country> queryAllCountries();

}
