package com.company;

public class Discipline {
    private String name;
    private int workload;
    private Professor professor;

    public Discipline(String name, int workload, Professor professor) {
        this.name = name;
        this.workload = workload;
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

}
