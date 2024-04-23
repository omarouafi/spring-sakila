package com.hitema.intro.services;

import com.hitema.intro.models.City;
import com.hitema.intro.repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City create(City city) {
        return  cityRepository.save(city);
    }

    @Override
    public City read(Long id) {
        return cityRepository.findById(id).get();
    }

    @Override
    public City update(City city) {
        return cityRepository.save(city);
    }

    @Override
    public Boolean delete(Long id) {
        if (cityRepository.existsById(id)) {
            cityRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<City> readAll() {
        return cityRepository.findAll();
    }
}
