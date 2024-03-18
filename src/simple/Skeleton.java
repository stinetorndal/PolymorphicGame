package simple;

import simple.Creature;

import java.util.Random;

public class Skeleton implements Creature {
    private int health;
    private String name;
    private boolean underGround;
    Random r = new Random();
    public Skeleton(String name) {
        this.health = 1;
        this.name = name;

        if (r.nextInt() % 5 == 0) {
            underGround = true;
        } else {
            underGround = false;
        }
    }

    @Override
    public int attack() {
        if (underGround)
            return 3;
        else
            return 1;
    }

    @Override
    public String meet() {
        if (underGround)
            return "you stumble over a heap of bones, you compose youself, and keep moving, but you hear a a noice from the heap";
        else
            return "you see a what apears to be a bony person walking towards you...";
    }
    @Override
    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public String getName() {
        return this.name;
    }
    }


