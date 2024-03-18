package simple;


import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Goblin implements Creature {

    private String name;
    private boolean isSand;
    private int health;

    public Goblin(String name) {
        this.name = name;
        this.health = 50;
        Random r = new Random();
        if (r.nextInt() % 2 == 0) {
            isSand = true;
        } else {
            isSand = false;
        }

    }

    @Override
    public int attack() {
        if (isSand) {
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
            System.out.println("The goblin threw sand in your eyes and you fell");
            System.out.println(Main.gameplay.getPlayer().getName() + " inflicted 1 damage to yourself");
            health -= damage -3;
            Main.gameplay.getPlayer().changeHealth(-2);
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

    @Override
    public String getType() {
        return null;
    }
}

