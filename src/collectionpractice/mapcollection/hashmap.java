package collectionpractice.mapcollection;

import java.util.HashMap;
import java.util.HashSet;

/*
         put() --> Anahtar(K) ve değer(V) ekleme işlevini yerine getirir.
         get(key) --> Anahtara karşılık gelen değeri döndürür.
         remove() --> Anahtara veya değere karşılık gelen veriyi siler.
         size() --> Map içerisinde depolnan anahtar ve değerlerin sayısını döner.
         clear() --> Map içerisinde depolanan tüm verileri siler .
         containsKey(Key) --> Depolanan veri içerisinde anahtar aramayı sağlar.Eğer anahtar varsa true yoksa false döndürür.
         containsValue(Value) --> Depolanan veri içerisinde değer aramayı sağlar. Eğer değer varsa true yoksa false döndürür

          HashMap<K,V>
         -Aynı anahtar tanımı bir kez olur ancak aynı değeri birden fazla kez tanımlanabilir.
         -Elemanlar bellekte rastgele depolanır.
         */

         /* Map yapısı, verileri tek başına boşluğa fırlatmaz; her zaman bir çift (pair) olarak tutar.
         Klasik dizilerde (ArrayList vb.) verilere 0, 1, 2 gibi indeks numaralarıyla ulaşırsın.
         Map'te ise indeks numarasını tamamen sen belirlersin ve bu özel indekse Anahtar (Key) denir.
         T.C. Kimlik No (Key) ---> Vatandaşın Tüm Verileri (Value)
         Öğrenci No (Key) ---> Öğrencinin Not Ortalaması (Value)

         Ne işe yarar ?, en büyük avantajı hızdır Bir ArrayList içinde 1 milyon eleman varsa ve sen bir veriyi arıyorsan,
         algoritma veriyi bulana kadar listeyi tek tek taramak zorundadır.

         HashMap, arka planda harika bir karma (Hashing) matematiği kullanır.
         Anahtarı verdiğin an, sistemde 1 milyon veri bile olsa nokta atışı gidip o veriyi bulur.
         Bilgisayar mühendisliğinde buna O(1) zaman karmaşıklığı denir; yani verinin boyutu ne kadar artarsa artsın,
         bulma süreniz hep aynı (anında) olur

         örnek olarak diyelm ki piyasa takip sunucusu yazıyorum sistemde binlerce hisse senedi dönüyor olsa bile
         boseMap.get("AKBNK") dediğim an sistem döngüye girmeden doğrudan akbankın o anki değerini çekiyor,
         listelerle yapsaydım her fiyat güncellemesinde tüm listeyi taramam gerekirdi.

         Ayrıca GameDevlerinde unityde vs sıklıkla kullanmısım farkında olmadan, oyuncunun can ve zırh değerleri
         düşmanların can değerlerinde vs sıklıkla kullanmısım, misal oyun orda tek tek kim hasar yemiş diye bakmıyor
         oyuncunun idsine gidiyor direkt ve hasar almasını sağlıyor bu da tabiki oyunun yapıtaşlarından oluyor.

         */





public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();
        hmap.put(51,"Cem");
        hmap.put(11,"Grenwood");
        hmap.put(19,"Muriqi");
        hmap.put(10,"Asensio");
        for (Integer i:hmap.keySet()){
            System.out.println("Numaralar: (k) " + i + " Oyuncu : (v) " + hmap.get(i));
        }
        System.out.println("------------------------");
        hmap.remove(11);
        for (Integer i:hmap.keySet()){
            System.out.println("Numaralar: (k) " + i + " Oyuncu : (v) " + hmap.get(i));
        }
        hmap.put(10, "Alex de Souza");
        System.out.println(hmap.get(10)); // üstüne yazıyor
        hmap.putIfAbsent(10, "Dusan Tadic");
        System.out.println(hmap.get(10)); //bu komutta da eğer boşsa koy diyo orda alex olduğu için tadici koymayı reddetti mesela
    }
}
