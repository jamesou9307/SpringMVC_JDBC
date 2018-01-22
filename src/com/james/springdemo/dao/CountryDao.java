package com.james.springdemo.dao;

import com.james.springdemo.entity.Country;

public interface CountryDao {

    Country queryCountry(String countryCode);

}
