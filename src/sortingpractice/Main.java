package sortingpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Enemy> enemies = new ArrayList<>();
    //sadece eklemeyle ilgilendiğimden böyle yapıyorm
    enemies.add(new Enemy("Zombi",50));
    enemies.add(new Enemy("Ejderha",100));
    enemies.add(new Enemy("Büyücü",75));
    enemies.add(new Enemy("Suikastci",65));

        System.out.println("----------Listenin ilk hali--------");
        enemies.forEach(System.out::println);

        Collections.sort(enemies);

        System.out.println("----------- COMPARABLE -----------");
        enemies.forEach(System.out::println);


        enemies.sort(Comparator.comparing(Enemy::getName));

        System.out.println("----------Comparator---------------");
        enemies.forEach(System.out::println);

    }
}
