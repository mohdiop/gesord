package com.mohdiop.gesord.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "computers")
public class Computer {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String mark;
    private String model;
    private Float price;
    private String techs;
    private int employeeId;

    public Computer(int id, String mark, String model, Float price, String techs, int employeeId){
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.techs = techs;
        this.employeeId = employeeId;
    }

    public Computer(String mark, String model, Float price, String techs, int employeeId){
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.techs = techs;
        this.employeeId = employeeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getTechs() {
        return techs;
    }

    public void setTechs(String techs) {
        this.techs = techs;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
