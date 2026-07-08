package Sayi_Tahmin_Oyunu;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int can = 4;
        int sayi = rnd.nextInt(101);
        System.out.println(" -------- Sayi Tahmin Oyununa Hoşgeldin! ----------- ");
        while (can > 0 ){
            System.out.println(" Lütfen 0-100 Arasında Bir Tahminde Bulun:  ");
            int inp = input.nextInt();
            if((inp < 0) || (inp>100)){
                System.out.println("Geçersiz Bir Sayı Girdiniz! Lütfen 0-100 Arasında bir sayi giriniz. ");
                continue;
            } else if (inp == sayi) {
                System.out.println("Seni Şanslı... DOĞRU TAHMİN!!!! ");
                break;
            }
            else {
                can = can - 1;
                System.out.println("Maalesef Bilemedin :(((( Kalan Can: " + can);
                if(can < 3 && can !=0){
                    System.out.println("Hadi Biraz Yardımcı Olalım, Tuttuğum sayı bu 2 sinin arasında :) " + (sayi-10) + (" - ")+ (sayi+10));
                }
                else if (can == 0){
                    System.out.println("Canlarınız Bitmiştir Bir Dahaki Sefere!!! ");
                    break;
                }
            }
        }
    }
}
