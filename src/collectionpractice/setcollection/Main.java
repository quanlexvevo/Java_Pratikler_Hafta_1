    package collectionpractice.setcollection;
    import java.util.*;

    //list ve setler birbirine oldukca benzemekle beraber temel farkları bir değeri bir kez saklayabiliyoruz sette

    public class Main {
        public static void main(String[] args) {
            HashSet<Integer> set = new HashSet<>();
            set.add(10);
            set.add(15);
            set.add(6);
            set.add(4);
            set.add(8);
            set.add(2);
            set.add(17);
            set.add(33);

            for (Integer s:set){
                System.out.println("deger: " + s);
            }

            set.remove(10);
            System.out.println(" ");
            for (Integer s:set){
                System.out.println("Deger: "+s);
            }
            /*
             * Şimdi burda neden 17 33 sonra 2 4 6 8 diye gitti şimdi şöyle ki hashset bellekte otomatik olarak 16 odalı (bucket)
             * bir dizi yaratıyor, içine 0-15 arası sayılar koyduğumuzda kendi indexlerini oda numarası olarak kabul ediyor
             * bu yüzden sıralıymıs gibi bir ilüzyon oluyor 2 sayısını 2.odaya koyuyor 4 ü 4.odaya gibi gibi for döngüsü calıstığında
             * java 0 dan 15 e doğru okuyor, 33 ve 17 de bu ilüzyonu çökertiyor sınırı aşan sayılar geldiği zaman java bunu boş odalara atıyor
             * formül şudur: Sayı % 16 = Gideceği Oda. ama mesela 33de de kalan 1,17de de kalan 1 nasıl oluyor:
             * şöyle ki burda işin içine linkedlist giriyor ikisi de 1. odada bulunuyor [17 --> 33] yanyana duruyor
             * odada önce 17 sonra ona bağlı olan 33 ü yazdırır
             * */

            System.out.println("-----------------------------------");

            LinkedHashSet<String> str = new LinkedHashSet<>();
            str.add("Cem");
            str.add("Ecem");
            str.add("Enes");
            str.add("Cem");
            str.add("Cem");

            for (String s:str){
                System.out.println("Deger: "+s);
            }
            /*
            *Sorting yani değere göre sıralamak TreeSet işidir, 50 10 30 girsem o bana otomatik olarak 10 30 50 verir
            * ekleme sırasını korumak istersek yani üstten aşağı sıralı şekilde bastırmak istersem bu LinkedHashSet işidir
            *
            *
            * nerde kullanırız, mesela verilerimde tekrar eden eleman olmasın ve nasıl verdiysem o sırada kalsın diyosak linkedhashset
            * Diyelim ki elinde bir ArrayList var ve içinde kullanıcının sepete eklediği ürünlerin ID'leri var.
            * Kullanıcı aynı ürüne yanlışlıkla 3 kez tıklamış. Sen bu kopyaları silmek istiyorsun
              ama kullanıcının sepete ekleme sırasını da bozmak istemiyorsun.
              HashSet kullansaydın: Kopyalar silinirdi ama sepetin sırası darmadağın olurdu.
              LinkedHashSet kullanırsan: ArrayList'i direkt bunun içine atarsın.
              Hem kopyalar anında uçar, hem de sepet sırası orijinal haliyle (ilk eklenen en üstte olacak şekilde) kalır.
              Arama geçmişlerinde keza kullanılır aynı kelimeyi kimse 5 defa görmek istemez
              ve bir de en son ne arattıysan aynı sırayla görmek istersin karısık olmasını kimse istemez
              *
            * */

        }

    }
