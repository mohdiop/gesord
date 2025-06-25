package com.mohdiop.gesord.service;

import com.mohdiop.gesord.entity.Computer;
import com.mohdiop.gesord.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerService {

    @Autowired
    private ComputerRepository computerRepository;

    public Computer createComputer(Computer computer) {
        return computerRepository.save(computer);
    }

    public Computer updateComputer(Computer computer){
        return computerRepository.save(computer);
    }

    public Boolean deleteComputerById(int id) {
        computerRepository.deleteById(id);
        return true;
    }

    public List<Computer> getAllComputers() {
        return computerRepository.findAll();
    }

    public Computer getComputerById(int id) {
        Optional<Computer> optionalComputer = computerRepository.findById(id);
        return optionalComputer.orElse(null);
    }

    public Computer getComputerByEmployeeId(int employeeId) {
        return computerRepository.findByEmployeeId(employeeId);
    }
}
