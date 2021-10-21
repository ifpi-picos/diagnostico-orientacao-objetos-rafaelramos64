import java.util.List;

public class Nurse {
    private String name;
    private float salary;
    private List benefits;;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
