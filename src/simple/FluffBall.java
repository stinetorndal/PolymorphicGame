package simple;
import java.util.Random;

public class FluffBall implements Creature {
    private String name;
    private int health;

    private boolean isApologised;

    public FluffBall(String name) {
        this.name = name;

        //Decides health level for FluffBall
        Random r = new Random();
        if(r.nextInt() % 2 == 0) {
            isApologised = true;
        } else {
            isApologised = false;
        }

        this.health = 100;

    }

    @Override
    public int attack() {

        if(isApologised)
            return 0;
        else
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
        if (isApologised)
            return "you stumble upon a small fluffy creature, as you see the cute fluffy thing you start apologize to it.";
        else
            return "you stumble upon a small fluffy creature, as you see the cute fluffy thing you just stand back up and shakes your head at it... It now starts growling";

    }

}
