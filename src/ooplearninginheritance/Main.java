package ooplearninginheritance;

public class Main {
    public static void main(String[] args) {
      /*  Employee e = new Employee();
        e.logIn();
        Academician a = new Academician();
        a.logIn(); //bu metod academiğin içinde olmamasına rağmen kalıtım sayesinde metoda erişebiliyor
        Officers o = new Officers();
        o.logIn();

        //YUKARI DOGRU KALITIM OLMAZ AGACTAN ASAGI DOGRU OLMALI
        Employee e = new Employee();
        Officers o = new Officers();
        Security s = new Security();
        Assistant a = new Assistant();
        a.joinLesson();
        Lecturer l = new Lecturer();
        l.joinLesson();
        -----------------------------------------------
        İmza Aynı Olmalı: Metodun ismi, parametreleri (sayısı ve tipi) ve dönüş tipi (veya alt tipi) babasındakiyle birebir aynı olmalı.

Erişim Kısıtlanamaz: Alt sınıfın erişim belirleyicisi (access modifier), üst sınıfınkinden daha kısıtlayıcı olamaz. (Yani baba metodu public yaptıysa, sen onu ezip private yapamazsın).

@Override Notasyonu: Metodun başına @Override yazmak racondur. Zorunlu değildir ama hem kodu okuyana
"aga ben bu metodu ezdim" mesajı verir hem de yanlışlıkla ismini falan yanlış yazarsan
(mesela sesCikar yerine sesCikr yazarsan) derleyicinin seni uyarmasını sağlar.

// Üst Sınıf (Ata)
class Hayvan {
    public void sesCikar() {
        System.out.println("Hayvan bir ses çıkarıyor...");
    }
}

// Alt Sınıf (Çocuk)
class Kopek extends Hayvan {

    // Babasından (Hayvan'dan) gelen metodu eziyoruz
    @Override
    public void sesCikar() {
        System.out.println("Hav Hav!");
    }
}

// Başka bir Alt Sınıf
class Kedi extends Hayvan {

    @Override
    public void sesCikar() {
        System.out.println("Miyav!");
    }
}

Polymorphism nedir : bi tane parent class olsun bu da işte ressam olsun dali picasso bunlar children classların
misal çiz metodu ikisinde de aynı mı çalısır ikisi de aynı mı çizer hayır ikisi de farklı tarzlarda çiziyolar
polymorphism bunun gibi iki farklı children classta metodumuz farklı işlemler yapıyor
yani girdiği classa göre şekil değiştiriyor polymorphism de zaten ismiyle aynı işleve
yarıyor, bunu da fonksiyonları Override ederek yapıyor. bu verdiğim örnekte runtime polymorphism oluyor.
farklı parametrelerin alıncağı durumsa compile-time polymorphism oluyor burda overloading oluyor, metodun miras
yoluyla ezilmesi değil aynı sınıf içinde aşırı yüklenmesi durumu.
-----------------------------------------------------------------------------------------
INTERFACE: Interface'in Altın Kuralları
Interface'lerden new anahtar kelimesi ile nesne üretilemez. (Çünkü içinde gövdesi olmayan, havada asılı metotlar var).
Bir sınıf aynı anda birden fazla interface'i implement edebilir. (class AkilliTelefon implements Telefon, Kamera, MuzikCalar)
Bütün metotlar varsayılan (default) olarak public ve abstract'tır (gövdesizdir) Sistemleri birbirinden bağımsız,
 değiştirilebilir
Lego gibi söküp takılabilir hale getirmek için Interface'ler yazılım mimarisinin kalbidir.

interface Cizebilen {
    void ciz();
}
class Dali implements Cizebilen {
    @Override
    public void ciz() {
        System.out.println("Sürrealist bir tarzda, eriyen saatler çiziyorum.");
    }
}

class Picasso implements Cizebilen {
    @Override
    public void ciz() {
        System.out.println("Kübist tarzda, geometrik şekillerle çiziyorum.");
    }
}
        */
        //Employee e = new Employee("Cem Karaca", "karacacemm51@gmail.com", "IT","5537764686");
        Academician a = new Academician("Enes Çoban", "a@gmail.com", "CENG","5328913","Hoca","CENG101");
        System.out.println(a.getNameSurname());
        Lecturer l = new Lecturer("Mehmet","m@gmail.com","Machine","555","Lecturer","Physics","Docent");
        l.logIn();
    }
}