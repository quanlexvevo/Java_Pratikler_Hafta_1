package ooplearningstaticusement;
//bir akaryakıt istasyonu düşünün bir günün vardiyasında 12 tane pompacı çalışsın bunlar çalışırken vardiya
// bitiminde ceplerinde paralar olur arabalardan aldıkları şimdi bu paralar pompacıların mı ?
// değil pompacılar aracılığıyla istasyonundur yani gün sonunda vardiya bittiğinde bu pompacılar parayı
// muhasebeciye verir muhasebede paraları hesaplayıp tek bir sonuç olarak müdüre verir işte static buradaki
// muhasebecidir yani müdür gidipte 12 tane pompacıdan paraları almak için ayrı ayrı görüşme yapmaz muhasebeci
// tüm pompacıları gezer paraları toplar onları kendi hesaplar sonra müdüre verir burada müdür siz oluyorsunuz
// gidip kod yazarken 12 tane nesneden ayrı ayrı değerleri almak yerine 1 tane static fonksiyonu tanımlıyorsunuz
// o tüm nesneleri gezip istediğiniz özellikleri alıp sonra size getiriyor böylece 11 kere ekstradan hesaplama
// yapmış olmuyorsunuz olay bu
public class Main {
    public static void main(String[] args) {
        System.out.println("Online Öğrenci: " + Student.howStudent()); //nesne üretmeden de ulaşabildik çünkü statik
     Student s1 = new Student("Cem",51,90);
     Student s2 = new Student("Ecem", 35,80);
     Student s3 = new Student("Ahmet", 191,65);
        System.out.println("Online Öğrenci: " + Student.howStudent());
        s1.exit();
        System.out.println("Online Öğrenci: " + Student.howStudent());
        int[] grades = new int[3];
        grades[0] = s1.grade;
        grades[1] = s2.grade;
        grades[2] = s3.grade;
        System.out.println(Student.calculateAVG(grades));//hiçbir nesne üretmeden otomatik olarak hafızada Student.calculateAVG geliyor
        System.out.println(Math.abs(-1));//math sınıfından bir nesne üretmeden bu metodu kullanabiliyoruz çünkü static tanımlanmıs
    }


}
