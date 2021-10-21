
public class Hospital {
    private String name;
    private List<Nurse> nurses;

    public Hospital(String name) {
        this.name = name;
        this.nurses = new ArrayList<Nurse>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNurse(Nurse nurse){
        this.nurses.add(nurse);
    }

    public void removeNurse(Nurse nurse){
        this.nurses.remove(nurse);
    }


    public List<Nurse> getNurses() {
        return nurses;
    }
}

