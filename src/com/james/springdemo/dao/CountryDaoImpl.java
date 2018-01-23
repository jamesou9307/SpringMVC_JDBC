package com.james.springdemo.dao;

import com.james.springdemo.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CountryDaoImpl implements CountryDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Country queryCountry(String countryCode) {
        Country country=new Country();

        String sql="select a.code,a.name from world.country a where a.code=?";
        jdbcTemplate.query(sql, new Object[]{countryCode}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                country.setCountryCode(resultSet.getString(1));
                country.setCountryName(resultSet.getString(2));
            }
        });

        return country;
    }

    @Override
    public List<Country> queryAllCountries() {

        List<Country> countries=new ArrayList<>();

        String sql="select a.code,a.name from world.country a";
        jdbcTemplate.query(sql, new Object[]{}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                Country country=new Country();
                country.setCountryCode(resultSet.getString(1));
                country.setCountryName(resultSet.getString(2));
                countries.add(country);
            }
        });
        return countries;
    }
}
