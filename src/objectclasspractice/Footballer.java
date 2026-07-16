package objectclasspractice;

import java.util.Objects;

public class Footballer {
    private String name;
    private String surname;
    private String team;
    private int number;


    public Footballer(String name, String surname,String team, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.team = team;
    }

    @Override
    public String toString() {
        return "İsim: " + name + " Soyad: " + surname +  " Katıldığı Takım : "+ team + " Forma Numarası : " + number;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Footballer)){
            return false;
        }
        Footballer other = (Footballer) obj;
        return name == other.name && surname == other.surname && team == other.team && number == other.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,surname,team,number);
    }
}
