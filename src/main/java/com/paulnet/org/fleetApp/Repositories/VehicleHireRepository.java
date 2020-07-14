package com.paulnet.org.fleetApp.Repositories;

import com.paulnet.org.fleetApp.Models.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {
}
