package collectionpractice.listcollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class listiterator {
    public static void main(String[] args) {
        LinkedList <String> tshirt = new LinkedList<>();
        tshirt.add("Adidas");
        tshirt.add("Nike");
        tshirt.add("Bershka");
        tshirt.add("Zara");
        getTshirt(tshirt);

        System.out.println("------------------------");

        Iterator<String> i1 = tshirt.iterator();
        while (i1.hasNext()){
            System.out.println("Tshirtler: "+ i1.next());
        }
    }

    public static void getTshirt(LinkedList<String> linked){
        ListIterator<String> a = linked.listIterator();
        while (a.hasNext()){//bir sonrakinde eleman var mı bak bakym diyo true false döndürüyor
            System.out.println("Tshirtler: " + a.next()); // next direkt sonraki elemanı döndürüyor
        }
    }
}
