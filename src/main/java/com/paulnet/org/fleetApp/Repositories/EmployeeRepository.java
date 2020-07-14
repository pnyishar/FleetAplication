package com.paulnet.org.fleetApp.Repositories;

import com.paulnet.org.fleetApp.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public Employee findByUsername(String un);
}
