package ooplearningencapsulationpractice;

public class Book {
    public String name,author,publisher;
    private int numberOfPage;

    Book(String name,int numberOfPage,String author, String publisher){
        this.name=name;
        this.author = author;
        this.publisher = publisher;
        if (numberOfPage < 1){
            this.numberOfPage = 10;
        }
        else {
            this.numberOfPage = numberOfPage;
        }
    }
    void pageSize(){
        System.out.println(numberOfPage);
    }//getter fonksiyon

    void setNumberOfPage(int size){
        if(size<0){
            this.numberOfPage = 10;
            return;
        }
        this.numberOfPage = size;
    }// setter fonksiyon private değerlere veya metodlarda değisiklik yapabilmem için gerekli fonksiyonlar bütünüdür
}

