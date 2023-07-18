package unit;
// Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
// На базе описания персонажей описать простейшую иерархию классов.
// В основной программе создать по одному экземпляру каждого класса.


import java.util.ArrayList;

public abstract class BazeHero implements Action {
        int id;
        int healthLevel;
        String name;
        String type;
        int attackLevelBase;
        protected int initiative;
        protected Coordinates location;
        public int getInitiative() {
            return initiative;
        }


        public BazeHero(String name,int id,int healthLevel, String type,int attackLevelBase,int initiative, int x, int y) {
            this.id = id;
            this.healthLevel = healthLevel;
            this.name = name;
            this.type = type;
            this.attackLevelBase = attackLevelBase;
            this.initiative = initiative;
            location = new Coordinates(x,y);


        }

        public String getInfo() {

            return ("NAME: " + name + " " + "TYPE: " + type + " "+ "ID: " + id + " " + "HEALTH: " + healthLevel +" " + "INITIATIVE: " + initiative + " " + "X= " + location.x + " " + "Y=" + location.y);
        }
        public void step(ArrayList<BazeHero> team2){

        }
        protected BazeHero finNearEnemi(ArrayList<BazeHero> enemies){
            double min = 100;

            int count = 0;
            for (int i = 0; i < enemies.size(); i++) {
                count ++;

                if (location.calcDistance(enemies.get(i).location) < min){
                    min = location.calcDistance(enemies.get(i).location);

                    count = i;
                }
            }
            return enemies.get(count);
        }
    }




