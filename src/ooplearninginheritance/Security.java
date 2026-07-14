package ooplearninginheritance;

public class Security extends Officers{
    public Security(String nameSurname, String email, String department, String phoneNumber, String shift, String docs) {
        super(nameSurname, email, department, phoneNumber, shift);
        this.docs = docs;
    }

    String docs;


}
