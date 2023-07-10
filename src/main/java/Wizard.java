public class Wizard extends BazeHero {

    public Wizard(int id) {
        super(id);
        this.heal = heal;
    }

    public int heal;

//    public Wizard(int id) {
//        super(id);
//    }
    //@Override

    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID: " + id + " " + "HEALTH: " + healthLevel + " " + " Initiative: " + initiative + " " + "HEAL: " + heal);
    }

    public void step() {


    }
}

