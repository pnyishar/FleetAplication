package com.paulnet.org.fleetApp.Repositories;

import com.paulnet.org.fleetApp.Models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {
}
