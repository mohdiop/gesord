package com.mohdiop.gesord.controller;

import com.mohdiop.gesord.entity.Employee;
import com.mohdiop.gesord.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @QueryMapping
    public Employee getEmployeeById(
            @Argument int id
    ) {
        return employeeService.getEmployeeById(id);
    }

    @QueryMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @MutationMapping
    public Employee createEmployee(
            @Argument String firstName,
            @Argument String lastName,
            @Argument String email,
            @Argument String position
    ) {
        return employeeService.createEmployee(
                new Employee(
                        firstName,
                        lastName,
                        email,
                        position
                )
        );
    }

    @MutationMapping
    public Employee createEmployee(
            @Argument int id,
            @Argument String firstName,
            @Argument String lastName,
            @Argument String email,
            @Argument String position
    ) {
        return employeeService.updateEmployee(
                new Employee(
                        id,
                        firstName,
                        lastName,
                        email,
                        position
                )
        );
    }

    @MutationMapping
    public Boolean deleteEmployeeById(
            @Argument int  id
    ) {
        return employeeService.deleteEmployeeById(id);
    }
}
