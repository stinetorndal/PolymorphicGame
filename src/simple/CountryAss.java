package simple;
import java.util.concurrent.ThreadLocalRandom;

public class CountryAss implements Creature {
    String name;
    int health;
    boolean isDrunk;

    public CountryAss(String name) {
        this.name = name;
        this.health = 20;
        isDrunk = ThreadLocalRandom.current().nextBoolean();

    }

    @Override
    public int attack() {
        if (isDrunk)
            return 8;
        else
            return 1;
    }

    @Override
    public String meet() {
        if (isDrunk)
            return "hear a big *BURP*, Svend sved yells: HOWDY PARTNER, LETS GET GOING BOY!!. Sounds like Svend is drunk.";
        else
            return " hear 'ZZZZZzzzzZZZZZZzzzzz' from a broken shed. Svend sounds hungover.";
    }

    @Override
    public void takeDamage(int damage) {
        if (isDrunk)
            this.health -= damage;
        else
            this.health -= (damage - 2);
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return null;
    }
}
