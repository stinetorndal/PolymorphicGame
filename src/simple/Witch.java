package simple;

public class Witch implements Creature{
    int health=20;
String name;
    public Witch(String name) {
        this.name = name;
    }

    @Override
    public int attack() {
        return 10;
    }

    @Override
    public String meet() {
        return "A wicked witch sits by the side";
    }

    @Override
    public void takeDamage(int damage) {

        health-=2;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return "Tricky Trick";
    }
}
