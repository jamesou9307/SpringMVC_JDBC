package com.james.springdemo.dao;


import com.james.springdemo.entity.City;
import netscape.security.PrivilegeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CityDaoImpl implements CityDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<City> queryAllCities(String countryCode) {
        List<City> cities=new ArrayList<>();

        String sql
                ="select a.* from city a where a.countryCode=?";
        jdbcTemplate.query(sql, new Object[]{countryCode}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                City city=new City();
                city.setId(resultSet.getInt(1));
                city.setName(resultSet.getString(2));
                city.setCountryCode(resultSet.getString(3));
                city.setDistrict(resultSet.getString(4));
                city.setPopulation(resultSet.getInt(5));

                cities.add(city);

            }
        });
        return cities;
    }
}
