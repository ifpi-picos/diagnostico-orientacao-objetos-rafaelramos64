package com.company;

import java.util.List;

public class Enfermeiro {
    private String name;
    private float salary;
    private List beneficios;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public float getLiquidSalary() {
        return salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setBenefits(List benefits) {
        this.benefits = benefits;
    }

    public List getBenefits(){
        return benefits;
    }
}
