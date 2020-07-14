package com.paulnet.org.fleetApp.Controllers;

import com.paulnet.org.fleetApp.Models.Country;
import com.paulnet.org.fleetApp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public String getCountries(Model model){
        List<Country> countryList = countryService.getAllCountries();
        model.addAttribute("countries", countryList);
        return "country";
    }

    @PostMapping("/countries/addNew")
    public String addNewCountry(Country country){
        countryService.saveCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping("/countries/findById")
    @ResponseBody
    public Optional<Country> getById(int id){
        return countryService.getById(id);
    }

    @RequestMapping(value = "/countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateCountry(Country country){
        countryService.save(country);
        return "redirect:/countries";
    }

    @RequestMapping(value = "/countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteCountry(Integer id){
        countryService.delete(id);
        return "redirect:/countries";
    }

}
