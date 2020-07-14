package com.paulnet.org.fleetApp.Repositories;

import com.paulnet.org.fleetApp.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
