package streamapipractice;

public class Enemy {
        private String name;
        private int health;
        private String type;

        public Enemy(String name, int health, String type) {
            this.name = name;
            this.health = health;
            this.type = type;
        }

        public String getName() { return name; }
        public int getHealth() { return health; }
        public String getType() { return type; }

        public void takeDamage(int damage) {
            this.health -= damage;
            System.out.println(this.name + " " + damage + " hasar aldı! Kalan Can: " + this.health);
        }
    }

