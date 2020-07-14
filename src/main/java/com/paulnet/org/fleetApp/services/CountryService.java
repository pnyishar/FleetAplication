package com.paulnet.org.fleetApp.services;

import com.paulnet.org.fleetApp.Models.Country;
import com.paulnet.org.fleetApp.Repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    //Get All Countries
    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

    //Get Country By Id
    public Optional<Country> getById(int id) {
        return countryRepository.findById(id);
    }

    //Save a Country
    public void saveCountry(Country country){
        countryRepository.save(country);
    }

    //Delete Country
    public void delete(int id) {
        countryRepository.deleteById(id);
    }

    //Update Country
    public void save( Country country) {
        countryRepository.save(country);
    }
}
