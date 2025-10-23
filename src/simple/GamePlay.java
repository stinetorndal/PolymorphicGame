package simple;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {

    private Player player;
    private CreatureGenerator creatureGenerator = new CreatureGenerator();
    private final Random rng = new Random();

    public void startGame() {
        //creatureGenerator.generateCreatures();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adventure begins!");
        System.out.println("What is your name?");
        String name = scanner.nextLine().trim();
        this.player = new Player(name);

        boolean continuePlaying = true;

        gameLoop:
        while (continuePlaying && player.getHealth() > 0) {
            System.out.print("You are walking and ");
            Creature creature = creatureGenerator.getRandomCreature();

            //------Hvis Creature er død; hent en ny eller spring over------
            if (creature == null || creature.getHealth() <= 0){
                System.out.println("There are no creatures around right now");
            break;
            }

            System.out.println(creature.meet());

            //------så kører kamp-løkken------
            while (creature.getHealth() > 0 && player.getHealth() > 0) {
                System.out.println("Will you fight " + creature.getName() + " y/n?");
                String fighting = scanner.nextLine().trim();

                if (fighting.equalsIgnoreCase("n")){
                    System.out.println(player.getName() + " chose not to fight.");
                break;
            } else if
                (!fighting.equalsIgnoreCase("y")) {
                    System.out.println("Please answer 'y' or 'n'.");
                    continue;
                    }
                fight(creature);

                if (creature.getHealth() <= 0) {
                    System.out.println(creature.getName() + " is dead. " + player.getName() + " gets 2 health points");
                    player.changeHealth(2);
                }
                System.out.println(player.getName() + " has " + player.getHealth() + " health points");
                System.out.println(creature.getName() + " has " + creature.getHealth() + " health points");

                if(player.getHealth() <= 0) {
                    System.out.println(player.getName() + " died.");
                    break gameLoop;
                }
            }
            System.out.println("Do you want to proceed y/n?");
            String proceed = scanner.nextLine().trim();
            if (proceed.equalsIgnoreCase("n")){
                continuePlaying = false;
            } else if (!proceed.equalsIgnoreCase("y")){
                System.out.println("Assuming you want to continue");
            }

        }
        System.out.println("Game over");
    }


    private void fight(Creature creature) {
        System.out.println(player.getName() + " and " + creature.getName() + " will now fight");
        //Random random = new Random();
        int playerAttack = rng.nextInt(10) + 1;
        int creatureAttack = creature.attack();
        System.out.println(player.getName() + " attacks with " + playerAttack);
        System.out.println(creature.getName() + " attacks with " + creatureAttack);

        if (playerAttack > creatureAttack) {
            System.out.println(creature.getName() + " is damaged by " + playerAttack + " points");
            creature.takeDamage(playerAttack);
        } else if (playerAttack < creatureAttack) {
            System.out.println(player.getName() + " is damaged by " + creatureAttack + " points");
            player.changeHealth(-creatureAttack);
        } else
            System.out.println("It is a tie! Nobody is damaged.");

    }
}


