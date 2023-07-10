public class Infantry extends BazeHero {

    public Infantry(int id,int healthLevel,String name,int attackLevelBase,int initiative) {
        super(id);
        this.attackLevelBase = attackLevelBase;
    }

    public Infantry(int id) {
        super(id);
    }
        public String getInfo() {
            return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID: " + id + " " + "HEALTH: " + healthLevel + " " + " Initiative: " + initiative + " " + "ATTACKLEVELBASE: " + attackLevelBase + " ");
        }




    @Override
    public void step() {

    }
}