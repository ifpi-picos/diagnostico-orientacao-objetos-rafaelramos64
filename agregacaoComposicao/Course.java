package com.company;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;

    private List<Discipline> disciplines;

    public Course(String name) {
        this.name = name;
        this.disciplines = new ArrayList<Discipline>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void removeDiscipline(Discipline discipline){
        this.disciplines.remove(discipline);
    }

    public void addDiscipline(Discipline discipline){
        this.disciplines.add(discipline);
    }

    public Discipline getDiscipline(int index){
        return this.disciplines.get(index);
    }
}
