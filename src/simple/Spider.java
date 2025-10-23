package simple;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Spider implements Creature {
    private final String name;
    private int health  = 10;
    private final boolean isNight;

    public Spider(String name) {
        this.name = name;
        this.isNight = ThreadLocalRandom.current().nextBoolean();
        System.out.println("(It is  " + (isNight? "night" : "day") + " for the spider.)");
    }


    @Override
    public int attack() {
        return isNight ? 5 : 2;
    }

    @Override
    public String meet() {
        return isNight
                ? "a giant spider sneaks up on you in the dark"
                : "a giant spider comes crawling out from a hole in the ground";
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void takeDamage(int damage) {
        health -= isNight ? damage : (damage + 1);
    }
    @Override
    public int getHealth() {
        return Math.max(0, health);
    }

/*    public boolean isNight() {
        return isNight();
    }
*/}