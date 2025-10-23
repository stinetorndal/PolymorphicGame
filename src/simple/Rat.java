package simple;

public class Rat implements Creature{

        private int health = 9;
        private final String name;

        public Rat(String name) {
            this.name = name;
        }

        @Override
        public int attack() {
            return 3;
        }
        @Override
        public void takeDamage(int damage) {
            health -= damage;
        }
        @Override
        public int getHealth() {
            return health;
        }
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public String meet() {
            return "from the sewers a disgusting, hairy micro-Chewbacca crawls out";
        }
    }




