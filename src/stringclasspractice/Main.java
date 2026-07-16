package stringclasspractice;

public class Main {
    public static void main(String[] args) {
        /*
        str.lenght() : girilen karakterin uzunluğu - sayısını verir
        str1.concat(str2) : string birleştirme
        str.indexOf("K") : karakterin konumunu verir
         */

        //Concat ile + farkı concatte null hatası alırken + ile birleştirildiğinde ide bunu boşluk olarak kabul edip birleştiriyor.

        String str = "MASON GREENWOOD";
        String str2 = " FENERBAHCEDE";

        System.out.println(str.length());  // spacelerde karakter sayılır
        System.out.println(str.concat(str2));
        System.out.println(str2.indexOf("F"));// burda başında boşluk olmasına rağmen F yi 1 den başlattı! karakter saymamıs
        System.out.println(str.charAt(6));//konumu verilen harfi okur
        System.out.println(str.contains("WOOD"));//stringte böyle bi kısım var mı diye bakıyor
        System.out.println(str2.endsWith("S"));
        System.out.println(str.startsWith("M"));
        System.out.println(str2.startsWith("F"));//indexof'ta saymamasına rağmen startswithte saydı başta bosluk oldugu icin reddetti
        System.out.println(str2.startsWith(" F"));//ama boslukla yazınca true dondu
        System.out.println(str2.replace(" FENERBAHCEDE", "FENERBAHÇE ŞAMPİYON"));
        System.out.println(str2.toLowerCase())  ;
        System.out.println(str2.toUpperCase());
        System.out.println(str.substring(1,3));//ilk indexi alıyor son indexi almıyor indexler 0 dan başlıyor ve kesiyor
        String data = "krampon forma tshirt şort";
        String[] splitResult = data.split(" ", 10);// regex neye göre bölceğimiz limitte ne kadar yapıcağımızı veriyor
        for (String word  : splitResult){
            System.out.println(word);
        }


    }
}
