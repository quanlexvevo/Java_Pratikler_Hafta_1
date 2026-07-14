package ooplearningstaticusement;

public class Student {
    public String name;
    public int id,grade;
    private static int counter = 0; //nesneye değil komple sınıfa ait

    Student(String name,int id,int grade){
        this.name=name;
        this.id=id;
        this.grade=grade;
        Student.counter++; // student. id vs gelmiyo çünkü static değiller
    }

    public void exit() {

    Student.counter--;

    }
    public static int howStudent(){
        return Student.counter;
    }
    public static double calculateAVG(int[] arr){
        double avg = 0;
        for (int i=0;i<arr.length;i++){
        avg += arr[i];
        }
        return avg / arr.length;
    }
}

