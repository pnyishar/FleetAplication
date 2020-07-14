package com.paulnet.org.fleetApp.Repositories;

import com.paulnet.org.fleetApp.Models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {
}
