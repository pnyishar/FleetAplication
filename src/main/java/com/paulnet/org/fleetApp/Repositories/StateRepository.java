package com.paulnet.org.fleetApp.Repositories;

import com.paulnet.org.fleetApp.Models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
}
