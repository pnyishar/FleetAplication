package com.paulnet.org.fleetApp.Repositories;

import com.paulnet.org.fleetApp.Models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {
}
