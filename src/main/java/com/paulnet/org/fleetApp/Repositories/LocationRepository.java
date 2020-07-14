package com.paulnet.org.fleetApp.Repositories;

import com.paulnet.org.fleetApp.Models.Location;
import org.springframework.data.repository.CrudRepository;


public interface LocationRepository extends CrudRepository<Location, Integer> {
}
