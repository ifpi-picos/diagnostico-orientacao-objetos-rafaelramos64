package com.company;

public class Main {

    public static void main(String[] args) {
        Hospital hrjl = new Hospital("Hospital Regional Justino Luz");

        PF nurse1 = new PF("00000000000");
        nurse1.setNome("Nara");
        nurse1.setSalario(1000);

        PJ nurse2 = new PJ("11111111111");
        nurse2.setNome("Ed");
        nurse2.setSalario(5000);

        apple.addNurse(nurse1);
        apple.addNurse(nurse2);

        System.out.println("Hospital: "+ hrjl.getName());

        System.out.println("Enfermeiros do HRJL " + hrjl.getName());

        for (Hospital f: hrjl.getNurses()){
            System.out.println(f.getName() + " | Salário Líquido: " + f.getSalarioLiquido());
        }
    }

}

