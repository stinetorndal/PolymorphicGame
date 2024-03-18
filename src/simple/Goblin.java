package simple;


import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Goblin implements Creature {

    private String name;
    private boolean isSand;
    private int health;

    public Goblin(String name) {
        this.name = name;
        this.health = 25;
        Random r = new Random();
        if (r.nextInt() % 10 == 0) {
            isSand = true;
        } else {
            isSand = false;
        }

    }

    @Override
    public int attack() {
        if (isSand) {
            System.out.println("The goblin threw sand in your eyes and you missed your turn \n");
            return 1;

        } else {
            return 5;
        }

    }

    public String meet() {
        return "a fearsome goblin has entered the arena";
    }


    public void takeDamage(int damage) {
        if (isSand) {
            health += 3;
            playerAttack = 0;
        } else {
            health -= damage;

        }
    }

    public int getHealth() {
        return health;
    }


    public String getName() {
        return name;
    }
}

