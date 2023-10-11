package simple;

public interface Creature {

    // return a number between 0 and 10
    // attack can depend on different things that you decide
    // it can be random, it can depend on current health, it can grow for each attack, it can always be 10 - you decide
    public int attack();

    // return a String to end the sentence "You are walking and "
    // it could for example be "a giant spider emerges from the dark corner" or " a happy troll jumps out of the woods"
    public String meet();

    // receive damage and do something (for instance decrease health)
    public void takeDamage(int damage);

    // return a number between 0 and 10
    // when health is 0, the creature dies
    // you decide how to calculate health
    // you can decrease it every time takeDamage() is called
    public int getHealth();

    // let the creature have a name
    public String getName();
}
