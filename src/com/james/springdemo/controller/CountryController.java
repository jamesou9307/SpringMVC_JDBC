package com.james.springdemo.controller;

import com.alibaba.fastjson.JSON;
import com.james.springdemo.entity.Country;
import com.james.springdemo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @ResponseBody
    @RequestMapping("/country")
    public String getCountryInfo(@RequestParam(value = "code",required = false)String countryCode){

        Country country=new Country();
        country=countryService.getCountryInfo(countryCode);
        String countryJson= JSON.toJSONString(country);
        return countryJson;
    }


}

