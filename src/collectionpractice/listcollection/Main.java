package collectionpractice.listcollection;

import java.util.ArrayList;
import java.util.List;

/*
Java'da Collections Framework (Koleksiyonlar Mimarisi),
birden fazla nesneyi tek bir birim olarak depolamak, yönetmek ve işlemek için kullanılan standartlaştırılmış bir yapıdır.

En temel mantığı, verileri saklama ve manipüle etme (arama, sıralama, ekleme, silme) işlerini sıfırdan yazmanıza gerek kalmadan,
size hazır ve optimize edilmiş veri yapıları (data structures) sunmasıdır.

Peki neden dümdüz array kullanmıyoruz : çünkü düz arraylerin boyutları sabittir sonradan arttırılamaz yeni ve daha büyük dizi oluşturup
verilerini kopyalamak gerekir.
Bunun dışında hazır metotları yoktur, bir elemanı silmek diziyi sıralamak veya sadece benzersizleri tutmak istersek
en baştan kendimiz yazmamız gerekir.

Collections Framework bu sorunları çözer.
Veri eklendikçe boyutu otomatik olarak büyüyen dinamik yapılar ve hazır veri işleme algoritmaları sağlar.
*  */
public class Main {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        ArrayList <String> str = new ArrayList<>();
        list.add("Cem Karaca");
        list.add("Cem Karaca");
        list.add("DSOADADOA");
        list.add("Cem Karaca");
        list.add("Cem Karaca");
        list.add("Fenerbahçe Şampiyon");
        str.add("Enes Çoban");
        str.add("Enes Çoban");
        str.add("Enes Çoban");
        str.add("Galatasaray kollanıyor");

        list.remove(2);
        for (String s:list){ //foreach  
            System.out.println("Deger: " +list);
        }
        list.remove(2);
        for (int i = 0; i<list.size();i++){
            System.out.println("Deger: " + list.get(i));
        }
        System.out.println("----------------");
        for (String s:str){
            System.out.println("Deger: "+str);
        }



    }
}
