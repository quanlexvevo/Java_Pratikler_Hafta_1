package ooplearninginheritance;

//extends --->   Academic Employee'ye bağlı demek
public class Academician extends Employee{
    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    String tasks,lessons;

    Academician(String nameSurname,String email, String department, String phoneNumber, String tasks,String lessons){
        super(nameSurname,email,department,phoneNumber);
        this.nameSurname = nameSurname;
        this.email = email;
        this.department = department;
        this.phoneNumber = phoneNumber;
    }
    public void joinLesson(){
        System.out.println("Derse Girildi! ");
    }
}
