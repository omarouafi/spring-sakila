package com.hitema.intro.services;

import com.hitema.intro.models.City;

import java.util.List;

public interface CityService {
    public City create(City city);
    public City read(Long id);
    public City update(City city);
    public Boolean delete(Long id);
    public List<City> readAll();

}
