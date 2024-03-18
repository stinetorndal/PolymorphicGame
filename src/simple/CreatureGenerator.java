package simple;

import java.util.ArrayList;
import java.util.Random;


public class CreatureGenerator {

    private ArrayList<Creature> creatures = new ArrayList<>();

    public CreatureGenerator(){

        generateCreatures();
    }

    public void generateCreatures() {
        creatures.add(new Skeleton("ROLF"));

    }

    public Creature getRandomCreature() {
        Random r = new Random();
        int i = r.nextInt(creatures.size());
        return creatures.get(i);
    }

    public void cloneCreature(Creature creature, String name){
       /* String creatureType = creature.getType();

        switch(creatureType){
            case "Dragon":creatures.add(new Dragon(name));

        }*/


    }
}
