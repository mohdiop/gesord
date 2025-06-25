package com.mohdiop.gesord.repository;

import com.mohdiop.gesord.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Integer> {
    Computer findByEmployeeId(int employeeId);
}
