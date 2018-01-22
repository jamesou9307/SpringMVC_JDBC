package com.james.springdemo.controller;

import com.alibaba.fastjson.JSON;
import com.james.springdemo.entity.City;
import com.james.springdemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @ResponseBody
    @RequestMapping("/cities")
    public String getAllCities(@RequestParam(value="code",required =false )String code){

        List<City> cities=cityService.getAllCity(code);
        String cityJson= JSON.toJSONString(cities);
        return cityJson;


    }

}
