package simple;

import java.util.Random;

public class Butterfly implements Creature {


    int health;
    String name;

    public Butterfly(String name) {
        this.health = 60;
        this.name = name;

    }

    @Override
    public int attack() {
        return 20;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String meet() {
        return "from the sky a beautiful butterfly comes flying";
    }
}
