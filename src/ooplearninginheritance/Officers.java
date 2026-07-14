package ooplearninginheritance;

public class Officers extends Employee {

    String shift;
    public Officers(String nameSurname, String email, String department, String phoneNumber, String shift) {
        super(nameSurname, email, department, phoneNumber);
        this.shift = shift;
    }


}
