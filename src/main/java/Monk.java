public class Monk extends BazeHero {
    public Monk(int id) {
        super(id);
        this.heal = heal;

    }

    public int heal;

    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID: " + id + " " + "HEALTH: " + healthLevel + " " + " Initiative: " + initiative + " " + "HEAL: " + heal + " ");
    }

    public void step() {

    }
}
