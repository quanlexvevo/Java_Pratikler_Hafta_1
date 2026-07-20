package streamapipractice;

import streamapipractice.Interface.Warrior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warrior masterWarrior = target -> {
            System.out.println("-> Master Savaşçı " + target.getName() + " hedefe kılıcını savurdu! ");
            target.takeDamage(50);
        };

        //Arrays.asList() sabit boyutlu bir liste üretir, new ArrayList<>() ise esnek (dinamik) boyutlu bir liste üretir.
        List<Enemy> enemyWave = Arrays.asList(
                new Enemy("Okçu Ork", 80, "Ork"),
                new Enemy("Boğulmuş", 250, "Undead"),
                new Enemy("Baltacı Ork", 100,"Ork"),
                new Enemy("Tepegöz",500,"Dev"),
                new Enemy("İskelet", 30, "Undead"),
                new Enemy("Tepegöz", 500,"Dev"),
                new Enemy("Karanlıklar Lordu", 0,"Titan")

        );

        List<Enemy> dangerous = enemyWave.stream() // banda koyduk şimdi
               /* .filter(enemy -> enemy.getType().equals("Ork")) // banttaki her elemanın türüne baktı ork olmayanları eledi
                .filter(enemy -> enemy.getHealth() > 50) // canı 50 den büyük olanları aldı
                .toList(); // enemyWave i bozmadan targetedOrks listesiyle bize teslim etti */
                .filter(enemy -> enemy.getHealth() > 0)
                .sorted((e1, e2) -> Integer.compare(e2.getHealth(), e1.getHealth()))
                //.map(entity -> entity.getName()) burda benim işime gelmiyor, objemi çöpe atıyo, isim yazan string kalıyor UI lar icin vs daha uygun kullanım olur
                .distinct()
                .limit(3)
                .toList();
        System.out.println("Radardaki Düşmanlar: ");
        //dangerous.forEach(text -> System.out.println(text));
        dangerous.forEach(System.out::println);


    }
}


//Objenin kendisine ihtiyacın varsa (hasar vermek, rengini değiştirmek vs.) map kullanma.
// Objenin sadece içindeki bir değere (ismi, canı, pozisyonu) ihtiyacın varsa map kullan.