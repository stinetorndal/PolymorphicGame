package simple;

import java.util.Random;

public class Zombie implements Creature{

    private int health = 11;
    private final String name;
    private boolean poisonedPlayer = false;

    public Zombie(String name) {
        this.name = name;
    }

    @Override
    public int attack() {
        Random r = new Random();
        int damage = r.nextInt(5) + 3;
        return damage;
    }
    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }
    @Override
    public int getHealth() {
        return health;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String meet() {
        return "a rotting zombie who clearly has never heard of deodorant, shambles toward you";
    }
    //------særligt ved zombie------
    public void poison (Player player) {
        Random r = new Random();
        int chance = r.nextInt(100);
        if (chance < 40 && !poisonedPlayer) {
            poisonedPlayer = true;
            System.out.println(name + "spits out a toxic bile and poisons you. You wish toothpaste was a part of the daily routine" + player.getName() + "!");
        }
    }
}