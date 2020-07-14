package com.paulnet.org.fleetApp.Repositories;

import com.paulnet.org.fleetApp.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
