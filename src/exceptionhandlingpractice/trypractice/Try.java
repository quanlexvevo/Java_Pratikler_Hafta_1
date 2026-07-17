package exceptionhandlingpractice.trypractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {

        // a = 2/0;
        // System.out.println(a);
        //System.out.println("Program Bitti! "); // Burda try catch kullanmazsak program son satırı görmeden hatayı alıp duruyor
        /*try{
            a = 5/0;
            System.out.println("TRY İCERİSİNDE!");
            System.out.println(a);// tryda hatayı yakaladı ve catche geçti direkt
        }catch (ArithmeticException e){//burda aldığımız hata kodunda arithmetic exception bu hatayı yakalayabilirmis burdan bir nesne oluşturduk
            System.out.println(e.getMessage());// mesajımızı okunabilir hale getiriyor
        }
        System.out.println("Program Şimdi Gerçekten Bitti! "); //  try catchden sonra hatamızı bize debug olarak bildirip programı sonuna getiriyor


        int[] arr = new int[3];
        try {
            arr[6] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString()); //burda exception atmak hata atmak terimi kullanılıyormus hangi sınıftan
            // kaynaklandığı görünüyormus misal burda ArrayIndexOutOfBoundsException sınıfı
        }

        System.out.println("Program Bitti!");*/
        //ŞİMDİ BİRDEN FAZLA HATA YAKALAMANIN NASIL KULLANILDIGINI ÖRNEKLİCEM

        int a = 0, b;
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Programımız Başladı!");

        try {
            a = 6/1; //yine de hatayı görürse direkt catch e atlıcak! aşağı inmez
           // System.out.println(a); bunu scanner hatalarını anlamak icin yoruma aldım temiz görünsün diye
            arr[4] = 5;
            b = scan.nextInt();

        }catch (ArithmeticException e){
            System.out.println("Bölünme Hatası! ");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array boyut hatası!");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        catch (Exception e){ //Exception tüm hataları kapsar
            System.out.println("Bir hata var");
            System.out.println(e.toString()); // misal burda java.util.InputMismatchException diyor yanlıs parametre girdiğimi görüyorum
        }finally {
            System.out.println("Finally kısmı"); //burası hata olsa da olmasa da çalısır her türlü calısır
        }
        System.out.println("Program Bİtit!");


    }

}
