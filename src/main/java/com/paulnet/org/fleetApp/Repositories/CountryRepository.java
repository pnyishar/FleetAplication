package com.paulnet.org.fleetApp.Repositories;

import com.paulnet.org.fleetApp.Models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
