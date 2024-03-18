package simple;

import java.util.Random;

public class Werewolf implements Creature{

    int health;
    String name;
    private boolean isNight;

    public Werewolf(String name) {
        this.health = 3000;
        this.name = name;
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
            return 20;
        else
            return 10;
    }

    public void takeDamage(int damage) {
        if (isNight)
            health -= damage;
        else
            health -= (damage + 5);
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String meet() {
       if(isNight)
        return "from the dark woods comes a Werewolf";
       else {
           return "from the local coffee shop come a normal guy";
       }
    }

}
