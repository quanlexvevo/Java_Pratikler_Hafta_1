package exceptionhandlingpractice.throwpractice;

import java.io.IOException;

public class Throwanother {

    public static void idCalculator(int id) throws IOException{
        if (id > 500){
            System.out.println("Hata! ");
            throw new IOException();
        }else {
            System.out.println("ID'niz aralığımızla uyuşuyor");
        }
    }

    public static void main(String[] args) throws IOException {

       /* try { //burda otomatik try catch e alıyor diyo ki patlatabilcek kodlar var sen bunu try catch e al
            idCalculator(540);
        } catch (IOException e) {
            System.out.println("ID'NİZ SİSTEMİMİZDE KAYITLI DEĞİL");//kullanıcıyı zorla try catch e sokuyoruz sistem aksamasın diye
        }*/

        //throws ise sorunu devrediyor try catch e sorunu çözmüyor

        idCalculator(550); //burda throws sorumluluğu devrediyor try catch'e, ben halletmiyorum çağıran halletsin diyor
    }

    //Checked Exception Tanım : Compiler seni zorlar — ya try-catch ile yakala, ya throws ile devret.
    // derleme hatası alırsın.Ne zaman oluşur? Genelde senin kontrolünde olmayan, dış dünyadan gelen durumlar:
    // dosya yok, ağ koptu, veritabanı erişilemiyor. IOException buna giriyor örnek olarak

    /*Unchecked Exception Tanım: RuntimeException'dan türer. Compiler seni zorlamaz — throws yazmasan da derlenir,
    try-catch'e almasan da derlenir. Ama yakalamazsan çalışma zamanında (runtime'da) fırlar ve program çöker.
    Ne zaman oluşur? Genelde senin kod hatandır, mantık hatasıdır — dış dünyadan gelen öngörülemez bir durum değildir.

    Neden compiler zorlamıyor? Çünkü teorik olarak neredeyse her satır bir NullPointerException fırlatabilir (herhangi bir referans null olabilir).
    Eğer bunları da checked yapsaydı, her satırı try-catch'e almak zorunda kalırdın — kod okunamaz hale gelirdi.
    Java bu yüzden "bunlar senin dikkat etmen gereken mantık hataları, ben seni zorlamıyorum" diyor.

    Custom Exception Tanım: Kendi projene özel, anlamlı isimli exception sınıfları yazmaktır.
    Exception'ı miras alırsan checked, RuntimeException'ı miras alırsan unchecked custom exception yaratmış olursun seçim sana kalmış.
     */
}
