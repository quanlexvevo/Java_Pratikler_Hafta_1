package ooplearninginheritance;

public class Main {
    public static void main(String[] args) {
      /*  Employee e = new Employee();
        e.logIn();
        Academician a = new Academician();
        a.logIn(); //bu metod academiğin içinde olmamasına rağmen kalıtım sayesinde metoda erişebiliyor
        Officers o = new Officers();
        o.logIn();

        //YUKARI DOGRU KALITIM OLMAZ AGACTAN ASAGI DOGRU OLMALI
        Employee e = new Employee();
        Officers o = new Officers();
        Security s = new Security();
        Assistant a = new Assistant();
        a.joinLesson();
        Lecturer l = new Lecturer();
        l.joinLesson();
        -----------------------------------------------
        */
        //Employee e = new Employee("Cem Karaca", "karacacemm51@gmail.com", "IT","5537764686");
        Academician a = new Academician("Enes Çoban", "a@gmail.com", "CENG","5328913","Hoca","CENG101");
        System.out.println(a.getNameSurname());
        Lecturer l = new Lecturer("Mehmet","m@gmail.com","Machine","555","Lecturer","Physics","Docent");
        l.logIn();
    }
}