package BankaHesabı_Class_Pratik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount hesap = new BankAccount("Cem", 3);
        System.out.println("Hangi İşlemi Yapmak İstersiniz:\n1)Bakiye Göster \n2)Para Yatır \n3)Para Çek");
        Scanner inp = new Scanner(System.in);
        int secim = inp.nextInt();
        if(secim == 1){
            hesap.bakiyeGoster();
        }
        if(secim == 2){
            System.out.println("Ne Kadar Yatırmak İstersiniz? : ");
            int yatirim = inp.nextInt();
            hesap.paraYatir(yatirim);
        }
        if(secim == 3){
            System.out.println("Ne Kadar Çekmek İstersiniz? : ");
            int cekim = inp.nextInt();
            hesap.paraCek(cekim);
        }

    }
}
