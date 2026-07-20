package streamapipractice.Interface;

import streamapipractice.Enemy;

@FunctionalInterface
public interface Warrior {
    void attack(Enemy target); //sadece 1 metot var!
}
