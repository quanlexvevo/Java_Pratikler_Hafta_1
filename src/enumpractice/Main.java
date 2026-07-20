package enumpractice;

        /*
        * enumlar javada birbiriyle ilişkili sabit değerleri gruplamak için kullanılıyor,
        * mantık olarak örnek vericek olursak bir oyunumuz var atıyorum God Of War oynucaz oyun başlarken bize zorluk seçtiriyor
        * eğer zorlukları String olarak KOLAY ORTA ZOR diye tutarsam ve ilerde entityleri zorluklarını levele bağlı güncellerken
        * COK_ZOR, CKLY şeklinde almaya çalısırsam patlar, veyahut int olarak 1 2 3 olarak sınıflarken biri 99 girebilir
        * ENUMLAR ise Tip Güvenliği sağlar kullanıcıyı kısıtlar, okunabilirliği arttırır.
        *
        * Peki enum metodlarında neler var
        * values() enumların içindeki değerleri bir array olarak verir
        *
        * valueOf("DEGER") verilen string metini gerçek enum nesnesine çevirir yazılan metin enumdakiyle birebir aynı olmalı
        * yoksa illegalargumentexception patlar
        *
        * ordinal() enum elemanlarının sırasını verir (index olarak)
        *
        * name() enum sabitinin kodda yazdıgı adını string olarak döndürür override edilemez kodda yazanı verir
        *
        * toString() varsayılan olarak name() ile aynı işe yarar
        * ama name() den farklı olarak  toString() override edilebilir ("Kolay yerine KOLAY SEVİYE") cıkmasını sağlayabilirim
        *
        * compareTo(Enum e) iki enum değerinin sırasını kıyaslar, biri diğerinden önce mi sonra mı tanımlanmıs onu anlamayı sağlar
        * aralarındaki sıra (index) farkını sayı olarak döndürür
        *
        *
        * Bir Enum'un Aslında "Class" Olduğunun 3 Kanıtı:

Değişken ve Metot Alabilir: İçerisine normal bir class gibi özellikler (örneğin can puanı, hasar çarpanı)
* ve fonksiyonlar ekleyebilirsin.

Constructor (Kurucu Metot) Alabilir:
* Enum sabitlerine (KOLAY, ZOR) yaratıldıkları anda başlangıç değerleri atayabilirsin.

Interface Uygulayabilir (Implements):
*  Başka bir sınıftan miras alamazlar (çünkü zaten java.lang.Enum'dan miras alıyorlar),
* ama tıpkı normal class'lar gibi arayüzleri (interface) implements edebilirler.
*
* Dışarıdan asla new anahtar kelimesiyle yeni bir nesne (obje) üretemezsin!
        *
        * */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Difficulty myDifficulty = Difficulty.Medium;
        System.out.println("Oyuna başlanılıcak Default Zorluk: " + myDifficulty);
        System.out.println("-------------------------------------------");
        System.out.println("Tüm Seviyeler");
            for (Difficulty d : Difficulty.values()){
                if (d != Difficulty.Unknown){
                    System.out.println("---" + d);
                }

        }

        System.out.println("Hard indexi : " + Difficulty.Hard.ordinal());

        Scanner scanner = new Scanner(System.in);
        Difficulty translatedInput = null;

        while (true) {
            System.out.println("Oyun Zorluğunuzu Seçin Lütfen!: (Easy, Medium, Hard) ");
            String input = scanner.next();

            try {
                translatedInput = Difficulty.valueOf(input);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("HATA: Hatalı giriş yaptınız! '" + input + "' geçerli bir zorluk değil.");
                System.out.println("Lütfen listedekilerin aynısını yazın.\n");
            }
        }

        switch (translatedInput){
            case Easy :
                System.out.println("Düşmanların zorluğu Kolay olarak ayarlandı!");
                break;
            case Medium :
                System.out.println("Düşmanların zorluğu Orta olarak ayarlandı!");
                break;
            case Hard :
                System.out.println("Düşmanların zorluğu Zor olarak ayarlandı!");
                break;
            default:
                throw new IllegalArgumentException("Sisteme tanımlı olmayan zorluk seviyesi tespit edildi: " + translatedInput);
        }
    }
}