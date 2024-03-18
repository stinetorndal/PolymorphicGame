package simple;

import java.util.Random;

public class Ooze implements Creature{
    private String name;
    private int health;
    private final int maxHealth;
    public Ooze(String name) {
        this.name = name;
        this.health = 10;
        this.maxHealth = this.health;
    }
    public Ooze(String name, int health) {
        this.name = name;
        this.health = health;
        this.maxHealth = this.health;
    }

    @Override
    public int attack() {
        Main.gameplay.getPlayer().changeHealth(-1);
        System.out.println(Main.gameplay.getPlayer().getName() + " is burned by the acid.");
        Random r = new Random();
        return r.nextInt(4);
    }

    @Override
    public String meet() {
        return "an ominous green puddle fills the passageway ahead. It seems to be attracted to your steel tipped boots.";
    }

    @Override
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health == this.maxHealth/2) {
          Main.gameplay.getCreatureGenerator().cloneCreature(this, "Small " + this.name);
        }

    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public String getName() {
        return this.name;
    }

   // @Override
    public String getType() {
        return "Ooze";
    }
}
