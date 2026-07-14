package ooplearninginheritance;

public class IT extends Officers{
    String tasks;
    public IT(String nameSurname, String email, String department, String phoneNumber, String shift, String tasks) {
        super(nameSurname, email, department, phoneNumber, shift);
        this.tasks = tasks;
    }


}
