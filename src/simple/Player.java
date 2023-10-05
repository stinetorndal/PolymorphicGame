package simple;

public class Player {
    private String name;
    int health;



    public Player(String name) {
        this.name = name;
        this.health = 50;

    }

    public String getName() {
        return name;
    }

    public void changeHealth(int changeby){
        this.health += changeby;
    }

    public int getHealth(){
        return health;
    }


}
