package simple;

import java.util.Random;

public class Striga implements Creature {

    private String name;
    private int health;

        private boolean isMidnight;

        public Striga(String name) {
            this.name = name;
         //   this.health = 12;

            //Decides health level for Striga
            Random r = new Random();

            if(r.nextInt() % 2 == 0) {
                isMidnight = true;
            } else {
                isMidnight = false;
            }

            if (isMidnight)
                this.health = 17;
            else
                this.health = 12;

        }

        @Override
        public int attack() {

            if(health <= (health/2))
                return 15;
            else
                return 5;

        }

        public void takeDamage(int damage) {
            health -= damage;
        }

        public int getHealth() {
            return health;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String meet() {
            return "see a dark tall figure, bend over a mutilated person, feasting on the insides of the poor person, whose screams cut through all other sounds... ";
        }
    }
