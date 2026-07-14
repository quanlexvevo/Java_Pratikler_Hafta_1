package ooplearninginheritance;

public class Assistant extends Academician {
    public String getMasterDegree() {
        return masterDegree;
    }

    public void setMasterDegree(String masterDegree) {
        this.masterDegree = masterDegree;
    }

    protected String masterDegree;
    public Assistant(String nameSurname, String email, String department, String phoneNumber, String tasks, String lessons, String masterDegree) {
        super(nameSurname, email, department, phoneNumber, tasks, lessons);
        this.masterDegree = masterDegree;
    }



}
