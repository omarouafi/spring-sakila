package com.hitema.intro.services;

import com.hitema.intro.models.Country;
import com.hitema.intro.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }



    @Override
    public Country create(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country read(Long id) {
        return countryRepository.findById(id).get();
    }

    @Override
    public Country update(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Boolean delete(Long id) {

        if (countryRepository.existsById(id)) {
            countryRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Country> readAll() {
        return countryRepository.findAll();
    }
}
