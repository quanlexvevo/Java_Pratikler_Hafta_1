package Not_Ortalama;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] dersler = {"Lineer Cebir","Fizik 2","Lojik 2","Programlama 2","Yazılım Mühendisliği","Bilgisayar Ağları","Veri Yapıları"};
        int[] notlar = new int[7];
        Scanner input = new Scanner(System.in);
        double sonuc=0;
        System.out.println("----------- Hoşgeldiniz ----------- ");

        for(int i=0; i< notlar.length; i++){
            System.out.print(dersler[i]+" dersinin notunu giriniz: ");
            notlar[i] = input.nextInt();
            sonuc+=notlar[i];
        }
        System.out.println("Ortalamanız: " + (sonuc/notlar.length));
    }
}
