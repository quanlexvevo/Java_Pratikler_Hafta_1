package ooplearninginheritance;

public class Lecturer extends Academician {
    public Lecturer(String nameSurname, String email, String department, String phoneNumber, String tasks, String lessons, String title) {
        super(nameSurname, email, department, phoneNumber, tasks, lessons);
        this.title = title;
    }

    String title;

}
