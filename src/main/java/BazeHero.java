
    // Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
// На базе описания персонажей описать простейшую иерархию классов.
// В основной программе создать по одному экземпляру каждого класса.


    public abstract class BazeHero implements Action {
        int id;
        int healthLevel;
        String name;
        String type;
        int attackLevelBase;
        int initiative;


        public BazeHero(int id) {
            this.id = id;
            this.healthLevel = healthLevel;
            this.name = name;
            this.type = type;
            this.attackLevelBase = attackLevelBase;
            this.initiative = initiative;


        }

        public String getInfo() {

            return ("NAME: " + name + " " + "TYPE: " + type + " "+ "ID: " + id + " " + "HEALTH: " + healthLevel +" " + "INITIATIVE: " + initiative);
        }
        public void step(){

        }
    }




