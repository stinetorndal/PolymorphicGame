package simple;

import java.util.Random;

public class Spider implements Creature {
    private String name;
    private int health;
    private boolean isNight;

    public Spider(String name) {
        this.name = name;
        this.health = 10;
        Random r = new Random();
        if (r.nextInt() % 2 == 0) {
            isNight = true;
        } else {
            isNight = false;
        }
    }

    @Override
    public int attack() {

        if (isNight)
            return 5;
        else
            return 2;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        if (isNight)
            health -= damage;
        else
            health -= (damage + 1);
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String meet() {
        if (isNight)
            return "a giant spider sneaks up on you in the dark";
        else
            return "a giant spider comes crawling from a hole in the ground";
    }
}
