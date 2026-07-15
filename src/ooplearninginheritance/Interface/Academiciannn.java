package ooplearninginheritance.Interface;

import ooplearninginheritance.Interface.IEmployee;

public class Academiciannn implements IEmployee {
    public Academiciannn(String nameSurname, String department, String tasks) {
        this.nameSurname = nameSurname;
        this.department = department;
        this.tasks = tasks;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    private String nameSurname,department,tasks;


    @Override
    public void join() {
        System.out.println("Giris Yapıldı! ");
    }

    @Override
    public void exit() {

    }

    @Override
    public boolean eat(int saat) {
        System.out.println("Yemek Yendi! ");
        return false;
    }
}