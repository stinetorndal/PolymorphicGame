package simple;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class CreatureGenerator {

    private ArrayList<Creature> creatures = new ArrayList<>();

    public CreatureGenerator(){
        generateCreatures();
    }

    public void generateCreatures() {
        //------rydder listen, hvis man kører igen------
        creatures.clear();
        creatures.add(new Spider("Shelob"));
        creatures.add(new Dragon("Smaug"));
        creatures.add(new Zombie("Zombie"));
        creatures.add(new Karen("Karen"));
        creatures.add(new Rat("Rat"));
    }

    public Creature getRandomCreature() {
        if (creatures.isEmpty()) {
            generateCreatures();
        }
        //------ returner altid ny instans------
        int index = ThreadLocalRandom.current().nextInt(creatures.size());
        Creature prototype = creatures.get(index);

        return switch (prototype.getClass().getSimpleName()) {
            case "Spider" -> new Spider("Shelob");
            case "Dragon" -> new Dragon("Smaug");
            case "Karen" -> new Karen("Karen");
            case "Vampire" -> new Zombie ("Rob");
            case "Rat" -> new Rat("Lars");
            default -> new Spider ("Unknown");
        };
        }
}
