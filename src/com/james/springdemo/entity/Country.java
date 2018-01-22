package com.james.springdemo.entity;

import java.util.List;

public class Country {

    private String countryCode;
    private String countryName;
    private List<City> cities;

    public Country(String countryCode, String countryName, List<City> cities) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.cities = cities;
    }

    public Country() {
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
