package simple;

import java.util.Random;
import java.util.Scanner;

public class Onepunchman implements Creature {
    String name;
    int health;
    public boolean isAngry;

    public Onepunchman(String name) {
        this.name = name;
        this.health = 100;
        Random r = new Random();
        if (r.nextInt() % 3 == 0){
            //måske en dialog hvis han ikke køber dine groceries bliver han ekstra sur
            isAngry = true;
        }else{
            isAngry = false;
        }


    }

    @Override
    public int attack() {
        if (isAngry)
        return 100;
        else
            return 25;
    }

    @Override
    public String meet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You walk through the city and suddenly stomps on a bag of groceries\n then you look up and see a bald looking guy getting angry");
        System.out.println("Do you want to pay for it or say F*** you?");
        String input = sc.nextLine();
        String output;

        if (input.equals("Fuk")) {
            output = "Serioussss PUNCH ";
        } else {
            input.equals("Pay");
            output = "Thanks tht was my last money";

        }
        return output;
    }

    @Override
    public void takeDamage(int damage) {
        if (isAngry)
            health-=damage;
        else
            health-=(damage + 1);

    }

    @Override
    public int getHealth() {
        return 150;
    }

    @Override
    public String getName() {
        return name;
    }
}
