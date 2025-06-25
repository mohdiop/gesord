package com.mohdiop.gesord.controller;

import com.mohdiop.gesord.entity.Computer;
import com.mohdiop.gesord.entity.Employee;
import com.mohdiop.gesord.service.ComputerService;
import com.mohdiop.gesord.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ComputerController {

    @Autowired
    private ComputerService computerService;

    @Autowired
    private EmployeeService employeeService;

    @QueryMapping
    public Computer getComputerById(
            @Argument int id
    ) {
        return computerService.getComputerById(id);
    }

    @QueryMapping
    public Computer getComputerByEmployeeId(
            @Argument int id
    ) {
        return computerService.getComputerByEmployeeId(id);
    }

    @QueryMapping
    public List<Computer> getAllComputers() {
        return computerService.getAllComputers();
    }

    @SchemaMapping
    public Employee employee(
            Computer computer
    ) {
        return employeeService.getEmployeeById(computer.getEmployeeId());
    }

    @MutationMapping
    public Computer createComputer(
            @Argument String mark,
            @Argument String model,
            @Argument Float price,
            @Argument String techs,
            @Argument int employeeId
    ) {
        return computerService.createComputer(
                new Computer(
                        mark,
                        model,
                        price,
                        techs,
                        employeeId
                )
        );
    }

    @MutationMapping
    public Computer updateComputerById(
            @Argument int id,
            @Argument String mark,
            @Argument String model,
            @Argument Float price,
            @Argument String techs,
            @Argument int employeeId
    ) {
        return computerService.updateComputer(
                new Computer(
                        id,
                        mark,
                        model,
                        price,
                        techs,
                        employeeId
                )
        );
    }

    @MutationMapping
    public Boolean deleteComputerById(
            @Argument int id
    ) {
        return computerService.deleteComputerById(id);
    }

}
