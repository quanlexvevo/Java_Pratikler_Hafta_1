package sortingpractice;

public class Enemy implements Comparable<sortingpractice.Enemy> {
        private String name;
        private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    @Override
    public int compareTo(sortingpractice.Enemy otherEnemy) {
        return Integer.compare(otherEnemy.getHealth(), this.health);
    }

    @Override
    public String toString() {
        return name + " (Can "  + health + ")";
    }
}
