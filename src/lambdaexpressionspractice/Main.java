package lambdaexpressionspractice;

import lambdaexpressionspractice.Interface.Warrior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Warrior lvl1Warrior = new Warrior() {
            @Override
            public void attack(String enemy) {
                System.out.println("Acemi Savaşcı kılıç kullandı Hedef: " + enemy);
            }
        };

        //şimdi bir de lambdayla yapalim
        Warrior lvl10Warrior = enemy -> System.out.println("Usta Savaşcı kritik atış yaptı! " + enemy + " TEK YEDİ!");

        Warrior witch = enemy ->{System.out.println("Büyücü asasını kaldırdı, mana topluyor!");
            System.out.println("Alev topu fırlatıldı! " + enemy + " yanıyor!");};

        System.out.println("------ Saldırı Testi Tekli ---------");
        lvl1Warrior.attack("Golem");
        lvl10Warrior.attack("Titan");
        witch.attack("Dragon");
        System.out.println("-----------------------------------------");


        System.out.println("------- Kombo Saldırı Testi -----------------");
        List<String> enemyWave = Arrays.asList("Ork", "İskelet", "Goblin", "Buz adam");

        enemyWave.forEach(target -> { //bu lambdadaki foreach bu teknik olarak döngü değil metottur bu yüzden break, continue yoktur
            System.out.print("Dalga: ");
                lvl10Warrior.attack(target);
        }); //enemyWave içindeki her bir elemanı target olarak al ve lvl10Warriora saldırt


        //burda lambdayı gereksiz class kullanımlarından arındırmak örn warrior override yapmamak gibi
        //lvl10warriorda da şablon oluşturmadık direkt odak noktasına indik
        //karakterlere ayrı yetenekler verebildik class acmadan örn  büyücü lvl1 warrior ve lvl10 warrior farklı durumlar cıkardı
    }
}
