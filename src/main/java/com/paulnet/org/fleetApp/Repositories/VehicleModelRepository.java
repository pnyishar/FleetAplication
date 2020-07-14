package com.paulnet.org.fleetApp.Repositories;

import com.paulnet.org.fleetApp.Models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {
}
