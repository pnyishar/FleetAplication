package com.paulnet.org.fleetApp.Repositories;

import com.paulnet.org.fleetApp.Models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {
}
