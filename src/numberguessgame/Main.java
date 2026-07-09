package numberguessgame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int lives = 4;
        int targetNumber = random.nextInt(101);
        System.out.println(" -------- Sayi Tahmin Oyununa Hoşgeldin! ----------- ");
        while (lives > 0) {
            System.out.println(" Lütfen 0-100 Arasında Bir Tahminde Bulun:  ");
            int guess = input.nextInt();
            if ((guess < 0) || (guess > 100)) {
                System.out.println("Geçersiz Bir Sayı Girdiniz! Lütfen 0-100 Arasında bir sayi giriniz. ");
                continue;
            } else if (guess == targetNumber) {
                System.out.println("Seni Şanslı... DOĞRU TAHMİN!!!! ");
                break;
            } else {
                lives = lives - 1;
                System.out.println("Maalesef Bilemedin :(((( Kalan Can: " + lives);
                if (lives < 3 && lives != 0) {
                    System.out.println("Hadi Biraz Yardımcı Olalım, Tuttuğum sayı bu 2 sinin arasında :) " + (targetNumber - 10) + (" - ") + (targetNumber + 10));
                } else if (lives == 0) {
                    System.out.println("Canlarınız Bitmiştir Bir Dahaki Sefere!!! ");
                    break;
                }
            }
        }
    }
}