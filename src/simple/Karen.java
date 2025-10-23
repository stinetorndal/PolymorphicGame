package simple;

public class Karen implements Creature{

        private int health = 15;
        private final String name;

        public Karen(String name) {
            this.name = name;
        }

        @Override
        public int attack() {
            //------Karens angreb bliver stærkere, jo svagere hun er------
            return 3 +(10-health) / 2;
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
            return "from the SUV, a woman with a sharp bob steps out and starts yelling";
        }
    }


