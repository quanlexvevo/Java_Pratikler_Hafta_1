package gpacalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] courses = {"Lineer Cebir", "Fizik 2", "Lojik 2", "Programlama 2", "Yazılım Mühendisliği", "Bilgisayar Ağları", "Veri Yapıları"};
        int[] grades = new int[7];
        Scanner input = new Scanner(System.in);
        double total = 0;
        System.out.println("----------- Hoşgeldiniz ----------- ");

        for (int i = 0; i < grades.length; i++) {
            System.out.print(courses[i] + " dersinin notunu giriniz: ");
            grades[i] = input.nextInt();
            total += grades[i];
        }
        System.out.println("Ortalamanız: " + (total / grades.length));
    }
}