package simple;

abstract public class ACreature implements Creature{
    protected String type;
    protected int health;
    protected String name;
    public ACreature(){


    }
    public String getType(){

        return this.type;
    }

    @Override
    abstract public int attack();

    @Override
    abstract public String meet();

    @Override
    abstract public void takeDamage(int damage);

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
