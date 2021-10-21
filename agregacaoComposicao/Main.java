package com.company;

public class Main {

    public static void main(String[] args) {
        Course course = new Course("ADS");

        Professor professor = new Professor("Jesiel");

        Discipline discipline = new Discipline("WEB", 120, professor);

        course.addDiscipline(discipline);

        System.out.println("Curso: "+ course.getName());

        System.out.println("Disciplinas de ADS");

        for (int i = 0; i < course.getDisciplines().size(); i++) {
            Discipline disc = course.getDisciplines().get(i);
            System.out.println(disc.getName() + " | ch: " + disc.getWorkload());
        }
    }
}