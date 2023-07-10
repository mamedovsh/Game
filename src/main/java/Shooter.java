public class Shooter extends BazeHero {
    public Shooter(int id ) {
        super(id);
        this.attackLevelBase = attackLevelBase;
    }

    public int attackLevelBase;

    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID: " + id + " " + "HEALTH: " + healthLevel + " " + " Initiative: " + initiative + "ATTACKLEVELBASE: " + attackLevelBase + "");

    }

    public void step() {


    }
}
