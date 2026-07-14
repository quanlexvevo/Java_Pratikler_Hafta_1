package ooplearninginheritance;

public class Employee {

    protected String nameSurname, email,department,phoneNumber;
    static int logInCount = 0;

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    Employee(String nameSurname,String email, String department, String phoneNumber){
        this.nameSurname = nameSurname;
        this.email = email;
        this.department = department;
        this.phoneNumber = phoneNumber;
    }

    void logIn(){
        System.out.println(this.nameSurname + " Giris Yaptı! ");;
    }
}
