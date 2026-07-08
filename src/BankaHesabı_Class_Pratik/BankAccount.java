package BankaHesabı_Class_Pratik;

public class BankAccount {
    private String hesapSahibi;
    private double bakiye = 0;

    BankAccount(String hesapSahibi, double bakiye){
        this.hesapSahibi=hesapSahibi;
        this.bakiye=bakiye;
    }

    //bir şey döndürmüceğim için public double olarak değil void ile yazıyorum!
    void paraYatir(double miktar) {
        if (miktar <= 0) {
            System.out.println("Geçersiz miktar!!!!");
            return;
        }
        bakiye += miktar;
        System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye + " TL");
    }

    void paraCek(double miktar) {
        if (miktar <= 0) {
            System.out.println("Geçersiz miktar!!!!");
            return;
        }
        if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye! Mevcut bakiyeniz: " + bakiye + " TL");
            return;
        }
        bakiye -= miktar;
        System.out.println(miktar + " TL çekildi. Yeni bakiyeniz: " + bakiye + " TL");
    }
    void bakiyeGoster() {
        System.out.println("Sayın: " + hesapSahibi + " - Güncel Bakiyeniz: " + bakiye + " TL");
    }

}
