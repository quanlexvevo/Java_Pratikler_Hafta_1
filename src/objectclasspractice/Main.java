package objectclasspractice;
//OBJECT CLASS TUM CLASSLARI KAPSAR, TUM CLASSLARIN ATASIDIR PARENT'IDIR,HER OLUŞTURULAN VE OLUŞTURULUCAK CLASS
//OBJECTTEN MİRAS ALIR!



public class Main {
    public static void main(String[] args) {

        Footballer f1 = new Footballer("Mason","Greenwood", "Fenerbahçe",11);
        System.out.println(f1);
        //objectclasspractice.Footballer@5b480cf9 burdaki @5b480cf9 hashcode umuz oluyor
        //ama ben classta override ettikten sonra istediğim şeyi döndürüyor
        //sout komutu idelerde otomatik çağırıyor, nesneyi metin karşılığını çağırıyor
        //sout'ta kendim tektek yazmaktansa bir fonksiyon içinde döndürmek isteiğim metini yazıyorum
        //genelde debugingde karsıma çıkarmıs!

        //EQUALS OVERRİDE ETTİĞİMİZDE HASHCODE U DA OVERRİDE ETMEK ZORUNDAYIZ


        //== ve equals farkı == adres kıyaslıyor equals direkt içindeki değerin aynı olup olmadığını
        Footballer f2 = new Footballer("Cengiz", "Under", "Fenerbahçe",11);
        Footballer f3 = new Footballer("Marco", "Asensio","Fenerbahçe",10);
        Footballer f4 = new Footballer("Marco", "Asensio","Fenerbahçe",10);
        //override etmeden önce false geldi neden çünkü kriterlerimizi söylemedik
        System.out.println(f3.equals(f4));
        System.out.println(f1.equals(f2));
        System.out.println(f2.equals(f4));
        System.out.println(f3.equals(f4));
        System.out.println(f3.hashCode());
        System.out.println(f4.hashCode());
        //EQUALS OVERRİDE ETTİĞİMİZDE HASHCODE U DA OVERRİDE ETMEK ZORUNDAYIZ hashmapler kullanılırken hashcode larda kullanılıyor
        //bu yüzden override etmek zorundaymısız!

    }
}
