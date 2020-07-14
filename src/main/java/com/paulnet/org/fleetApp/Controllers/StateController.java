package com.paulnet.org.fleetApp.Controllers;

import com.paulnet.org.fleetApp.Models.Country;
import com.paulnet.org.fleetApp.Models.State;
import com.paulnet.org.fleetApp.services.CountryService;
import com.paulnet.org.fleetApp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {

    @Autowired private StateService stateService;
    @Autowired private CountryService countryService;

    @GetMapping("/states")
    public String getStates(Model model){
        List<State> stateList = stateService.getAllStates();
        model.addAttribute("states", stateList);
        List<Country> countryList = countryService.getAllCountries();
        model.addAttribute("countries", countryList);
        return "state";
    }

    @PostMapping("/states/addNew")
    public String addNewState(State state){
        stateService.saveState(state);
        return "redirect:/states";
    }

    @RequestMapping("/states/findById")
    @ResponseBody
    public Optional<State> getStateById(int id){
        return stateService.findStateById(id);
    }

    @RequestMapping(value = "/states/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateState(State state){
        stateService.saveState(state);
        return "redirect:/states";
    }

    @RequestMapping(value = "/states/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteState(Integer id){
        stateService.deleteState(id);
        return "redirect:/states";
    }

}
