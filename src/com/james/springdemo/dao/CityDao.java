package com.james.springdemo.dao;

import com.james.springdemo.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CityDao {

    List<City> queryAllCities(String countryCode);



}



