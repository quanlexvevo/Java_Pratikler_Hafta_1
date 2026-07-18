package collectionpractice.listcollection.linkedlist;

import java.util.LinkedList;

/*
    Linkedlistler nodelardan oluşuyor diyebiliyoruz, değerler ve pointerlar var bu pointerlar bi sonraki değerin adresini göstericek
    şekilde oluyor bu nodelar birleşiyor ve linkedlist oluşturuyor

        * */
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> team = new LinkedList<>();
        team.add("Ederson");
        team.add("Ake");
        team.add("Vedat Muriqi");
        team.add("Kante");
        for (String t:team){
            System.out.println("Oyuncu: " + t);
        }
        team.add("Greenwood");
        for (int i = 0; i<team.size(); i++){
            System.out.println((i+1)+". Oyuncu: " + team.get(i));
        }
        team.clear();
        team.add("Aziz Yıldırım");
        for (String t2:team){
            System.out.println("Başkan: " +t2);
        }

    }
}
