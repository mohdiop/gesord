package com.mohdiop.gesord.repository;

import com.mohdiop.gesord.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
