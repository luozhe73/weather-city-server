package com.cloud.weather.service;

import com.cloud.weather.vo.City;

import java.util.List;

public interface CityDataService {

    List<City> listCity() throws Exception;

}
