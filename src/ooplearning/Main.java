package ooplearning;

// 1. INTERFACE: Bir yetenek sözleşmesi ("Ne yapabilir?")
interface Interactable {
    void interact(); // Gövdesi yoktur, implement eden sınıf bunu yazmak zorundadır.
}

// 2. ABSTRACT CLASS: Temel şablon ("Bu nedir?")
abstract class Entity {
    protected String name; // Alt sınıflar erişebilsin diye protected
    protected double health;

    // Constructor
    public Entity(String name, double health) {
        this.name = name;
        this.health = health;
    }

    // Abstract metot: Her alt varlık kendi hasar alma mantığını yazmak ZORUNDA.
    public abstract void takeDamage(double amount);

    // İçi dolu metot: Tüm varlıklar aynı şekilde bilgi verir.
    public void showInfo() {
        System.out.println("Varlık: " + name + " | Can: " + health);
    }
}

// 3. INHERITANCE (Kalıtım): Entity'den türüyor ve Interactable sözleşmesini imzalıyor
class Player extends Entity implements Interactable {
    private int armor; // Sadece Player'a özel özellik

    public Player(String name, double health, int armor) {
        super(name, health); // Üst sınıfın (Entity) constructor'ını çağırır
        this.armor = armor;
    }

    // 4. OVERRIDING: Üst sınıfın abstract metodunu ezerek içini dolduruyoruz
    @Override
    public void takeDamage(double amount) {
        double actualDamage = amount - (armor * 0.5);
        this.health -= Math.max(actualDamage, 0); // Can eksiye düşmesin
        System.out.println(name + " hasar aldı. Kalan can: " + health);
    }

    // Interface'in getirdiği zorunluluk
    @Override
    public void interact() {
        System.out.println(name + " ile etkileşime geçildi: Merhaba!");
    }
}

// ANA ÇALIŞMA ALANI
public class Main {
    public static void main(String[] args) {

        // 5. POLYMORPHISM (Çok Biçimlilik)
        // Üst sınıf referansı (Entity), alt sınıf nesnesini (Player) tutuyor!
        Entity myCharacter = new Player("Cem", 100.0, 50);

        myCharacter.showInfo();      // Entity'nin metodu çalışır
        myCharacter.takeDamage(30);  // Player'ın içindeki override edilmiş metot çalışır!

        // myCharacter.interact(); // HATA! Entity referansında interact yeteneği görünmez. 

        // Eğer interact etmek istiyorsak onu Interactable olarak ele almalıyız:
        Interactable interactiveObj = (Interactable) myCharacter; // Casting
        interactiveObj.interact();
    }
}