package ooplearningencapsulationpractice;
//Bir nesne doğduktan sonra durumu hiç değişemiyorsa ona değişmez (immutable) denir. String , Integer ,
//LocalDate hep böyledir. Değişmez nesneler thread-safe'tir, güvenle paylaşılır, HashMap anahtarı olarak
//sorunsuz çalışır ve akıl yürütmesi kolaydir 
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Star Wars Comics",30,"George Lucas","Lucas Arts");
        b1.pageSize();
        b1.setNumberOfPage(55);
        b1.pageSize();
        b1.setNumberOfPage(-800);
        b1.pageSize();
    }
}
