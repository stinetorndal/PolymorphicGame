package simple;

import java.util.ArrayList;
import java.util.Random;


public class CreatureGenerator {

    private ArrayList<Creature> creatures = new ArrayList<>();

    public CreatureGenerator(){
        generateCreatures();
    }

    public void generateCreatures() {
        creatures.add(new Spider("Shelob"));
        creatures.add(new Dragon("Puff"));
        creatures.add(new Spider("Peter"));
        creatures.add(new Dragon("Smaug"));
    }

    public Creature getRandomCreature() {
        Random r = new Random();
        int i = r.nextInt(creatures.size());
        return creatures.get(i);
    }
}
