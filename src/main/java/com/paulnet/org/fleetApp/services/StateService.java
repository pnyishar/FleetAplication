package com.paulnet.org.fleetApp.services;

import com.paulnet.org.fleetApp.Models.State;
import com.paulnet.org.fleetApp.Repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    //Get All States
    public List<State> getAllStates(){
        return stateRepository.findAll();
    }

    //Get State By Id
    public Optional<State> findStateById(int id) {
        return stateRepository.findById(id);
    }

    //Delete State
    public void deleteState(int id) {
        stateRepository.deleteById(id);
    }

    //Save and Update State
    public void saveState( State state) {
        stateRepository.save(state);
    }
}
