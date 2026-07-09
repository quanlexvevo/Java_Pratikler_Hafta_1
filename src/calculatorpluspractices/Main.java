package calculatorpluspractices;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    //call by value method
    /*static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Metot içinde: a = " + a + ", b = " + b);
    }*/
    public static void main(String[] args) {


        /*

        System.out.print("Ben Cem Karaca\n");
            System.out.println("Kafein Yazılımı seviyorum");
            System.out.println("Adınız?");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            System.out.println("Dogum Yiliniz?");
            int year = input.nextInt();
            input.nextLine();
            System.out.println("Selam " + name + " Dogum Yiliniz = " + year);
            System.out.println("En Sevdiginiz hayvan? ");
            String hayvan = input.nextLine();


    } // denemeler - tekrarlar - hatırlama süreci


        // Hesap Makinesi
        System.out.println("---------------- Hesap Makinesine Hoşgeldin !!! ---------------\n");
        System.out.println("Çıkmak için 'q', hafızayı sıfırlamak için 'c' yazabilirsin.\n");

        Scanner input = new Scanner(System.in);
        System.out.println("1.Sayinizi Giriniz = ");
        double input1 = input.nextDouble();

        while (true) {
            System.out.println("Diger Sayinizi Giriniz = ");
            double input2 = input.nextDouble();
            System.out.println("Kullanmak istediginiz islem ( +, -, *, /, c, q) = ");
            String islem = input.next();

            if (islem.equals("q")){
                System.out.println(" ------------- Hesap Makinesinden Çıkış Yapılıyor ------------ ");
                break;
            }

            if (islem.equals("c")){
                System.out.println("Hafıza Sıfırlandı");
                System.out.println("1.Sayinizi Giriniz = ");
                input1 = input.nextDouble();
                continue;
            }

            switch (islem) {
                case "+":
                    input1 = input1 + input2;
                    break;
                case "-":
                    input1 = input1 - input2;
                    break;
                case "*":
                    input1 = input1 * input2;
                    break;
                case "/":
                    if (input2 == 0) {
                        System.out.println("0 a bolme yapılamaz! ");
                        continue;
                    } else {input1 = input1 / input2;}
                    break;

                default:System.out.println("Gecersiz islem!");
                continue;
            }
            System.out.println("Sonucunuz = "+ input1);
        }





        //tek mi çift mi auto-boxing

        Integer sayi = 6;
        // Integer sayi = Integer.valueOf(51); (burası auto boxing oluyor sistem arkaplanda otomatik yapıyor bu işlemi)


        //if (sayi.intValue() % 2 == 0) burda auto unboxing oluyor çünku mod alma matematiksel bir işlem nesnelerle olmaz
        if (sayi % 2 == 0){
            System.out.println("Sayiniz Çift! ");
        }
        else {
            System.out.println("Sayiniz Tek! ");
        }


        //FizzBuzz Alıştırması Kafein Yazılım Örneği

        for(int x=1; x<=100; x++ ){
            if(x % 3 == 0){
                System.out.print("Kafein");
            } else if (x % 5 == 0) {
                System.out.println("Yazılım");
            } else if (x % 15 == 0) {
                System.out.println("Kafein Yazılım");
            }
        }

        //HARF NOTU HESAPLAMA
        System.out.println(" ------------ [HARF NOTU HESAPLAYICI] Lütfen Notunuzu Giriniz :  ---------------- ");
        Scanner not = new Scanner(System.in);
        int not1 = not.nextInt();
        if (not1 <= 100 && not1 >= 0){
            if (not1 >= 88 ){
                System.out.println("Harf Notunuz: AA");
            }
            if (not1 >= 77 && 88 > not1 ){
                System.out.println("Harf Notunuz: BB");
            }
            if (not1 >= 60 && 70 > not1 ){
                System.out.println("Harf Notunuz: CC");
            }
            if (not1 >= 40 && 60 > not1 ){
                System.out.println("Harf Notunuz: DD");
            }
            if (not1 >= 0 && 40 > not1 ){
                System.out.println("Harf Notunuz: FF");
            }


        }else System.out.println("Notunuz Geçerli Değildir ");


//Asal Sayı Bulma
        Scanner input = new Scanner(System.in);
        System.out.println("Sayınızı Giriniz");
        int sayi = input.nextInt();

        if (sayi <= 1) {
            System.out.println("Sayı Asal Değildir");
        } else {
            boolean asal = true;
            for (int x = 2; x <= sayi / 2; x++) {
                if (sayi % x == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.println("Bu Sayı Asaldır");
            } else {
                System.out.println("Bu Sayı Asal Değil!");
            }
        }

        //menü döngüsü
        Scanner input = new Scanner(System.in);
        int secim;
        do {
            System.out.println("1) Ekle");
             System.out.println("2) Çıkış");
             System.out.print("Seçiminiz: ");
            secim = input.nextInt();
            if (secim == 1) {
                System.out.println("Eklemek İstediğiniz Metini girin: ");
                String str = input.nextLine();
                str = input.nextLine();
                System.out.println("Ekleme işlemi yapıldı.");
                System.out.println("Eklenen Metin: " + str);
            } else if (secim == 2) {
                System.out.println("Programdan çıkılıyor...");
            } else {
                System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }

        } while (secim != 2);

    //Call By Value Deneyi

        int x = 5, y = 10;
        swap(x, y);
        System.out.println("Metot dışında: x = " + x + ", y = " + y);*/



    }









}