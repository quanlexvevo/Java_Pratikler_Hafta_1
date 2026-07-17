package exceptionhandlingpractice.throwpractice;

//throwun mantığı aslında projelerde backend crash yiyip çökmesin diye istemediğimiz durumlarda sistemin işleyişine devam edebilmesi
//için kullandığımız fonksiyonlardır.


public class Throw {

    public static void calculateGps(int gpsNo){
        if(gpsNo == 0){
            throw new ArithmeticException();
        }else {
            System.out.println("Konum Hesaplanıyor.. \n" + gpsNo);
        }
    }

    public static void main(String[] args) {

        calculateGps(1);
        System.out.println("Çalısıyor");

    }
}
