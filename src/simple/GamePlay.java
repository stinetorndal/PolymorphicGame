package simple;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {

    private Player player;
    private CreatureGenerator creatureGenerator = new CreatureGenerator();

    public void startGame() {
        creatureGenerator.generateCreatures();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adventure begins!");
        System.out.println("What is your name?");
        String input = scanner.nextLine();
        this.player = new Player(input);
        while (!input.equals("n") && player.getHealth() > 0) {
            System.out.print("You are walking and ");
            Creature creature = creatureGenerator.getRandomCreature();
            System.out.println(creature.meet());
            while (creature.getHealth() > 0 && player.getHealth() > 0) {
                System.out.println("Will you fight " + creature.getName() + " y/n?");
                String fighting = scanner.nextLine();
                if(fighting.equals("n"))
                    break;
                fight(creature);
                if (creature.getHealth() <= 0) {
                    System.out.println(creature.getName() + " is dead. " + player.getName() + " gets 2 healthpoints");
                    player.changeHealth(2);
                }
                System.out.println(player.getName() + " has " + player.getHealth() + " healthpoints");
                System.out.println(creature.getName() + " has " + creature.getHealth() + " healthpoints");
                if(player.getHealth() <= 0) {
                    System.out.println(player.getName() + " died.");
                    break;
                }
            }
            System.out.println("Do you want to procede y/n?");
            input = scanner.nextLine();

        }
        System.out.println("Game over");
    }


    private void fight(Creature creature) {
        System.out.println(player.getName() + " and " + creature.getName() + " will now fight");
        Random random = new Random();
        int playerAttack = random.nextInt(10) + 1;
        int creatureAttack = creature.attack();
        System.out.println(player.getName() + " attacks with " + playerAttack);
        System.out.println(creature.getName() + " attacks with " + creatureAttack);
        if (playerAttack > creatureAttack) {
            System.out.println(creature.getName() + " is damages by " + playerAttack + " points");
            creature.takeDamage(playerAttack);
        } else if (playerAttack < creatureAttack) {
            System.out.println(player.getName() + " is damaged by " + creatureAttack + " points");
            player.changeHealth(-creatureAttack);
        } else
            System.out.println("It is a tie! Nobody is damaged");

    }

}
