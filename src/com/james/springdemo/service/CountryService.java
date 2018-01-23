package com.james.springdemo.service;

import com.james.springdemo.entity.Country;

import java.util.List;

public interface CountryService {

    Country getCountryInfo(String countryCode);
    List<Country> getAllCountries();

}
