package unit;

import java.util.ArrayList;

public class Monk extends BazeHero {
    public Monk(String name, int id, int healthLevel, String type, int attackLevelBase, int initiative, int x, int y, int heal) {
        super(name, id, healthLevel, type, attackLevelBase, initiative, x, y);
        this.heal = heal;

    }

    public int heal;

    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID: " + id + " " + "HEALTH: " + healthLevel + " " + " Initiative: " + initiative + " " + "HEAL: " + heal + " " + "X= " + location.x + " " + "Y= " + location.y);
    }

    @Override
    public void step(ArrayList<BazeHero> enemies) {
        int [] temp = finNearEnemi(enemies);
        System.out.println("LN = " + temp[0] + " ENEMIES NAME" + enemies.get(temp[1]).name);
    }
}
