package simple;

public class Dragon implements Creature {

    int health;
    String name;

    public Dragon(String name) {
        this.health = 10;
        this.name = name;
    }

    @Override
    public int attack() {
        return 7;
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
        return "from the sky a metallic green dragon comes thundering";
    }
}
