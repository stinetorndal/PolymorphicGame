package simple;

public class Player {
    private String name;
    private int health;
    private boolean poisoned = false;



    public Player(String name) {
        this.name = name;
        this.health = 50;
    }

    public String getName() {
        return name;
    }

    public void changeHealth(int amount){
        health += amount;
        if (health < 0) health=0;

    }

    public int getHealth(){
        return health;
    }

    public boolean isPoisoned() {
        return poisoned;
    }
    public void applyPoisonDamage(){
        if (poisoned){
            health -= 1;
            System.out.println(name + " suffers 1 poison damage!");
            if (health <= 0) {
                System.out.println(name + " succumbed to true death by poison");
            }
        }
    }

}
