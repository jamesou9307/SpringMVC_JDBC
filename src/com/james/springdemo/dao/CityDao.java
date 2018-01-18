package com.james.springdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CityDao {

@Autowired
private JdbcTemplate jdbcTemplate;

}



