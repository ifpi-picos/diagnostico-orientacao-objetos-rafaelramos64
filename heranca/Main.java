
public class Main {

    public static void main(String[] args) {
        Hospital hrjl = new Hospital("Hospital Regional Justino Luz");

        PF nurse1 = new PF("00000000000");
        nurse1.setName("Nara");
        nurse1.setSalary(1000);

        PJ nurse2 = new PJ("11111111111");
        nurse2.setName("Ed");
        nurse2.setSalary(5000);

        hrjl.addNurse(nurse1);
        hrjl.addNurse(nurse2);

        System.out.println("Hospital: "+ hrjl.getName());

        System.out.println("Enfermeiros do HRJL " + hrjl.getName());

        for (Hospital f: hrjl.getNurses()){
            System.out.println(f.getName() + " | Salário Líquido: " + f.getLiquidSalary());
        }
    }

}

