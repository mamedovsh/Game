package unit;

import java.util.ArrayList;

public class Infantry extends BazeHero {

    public Infantry(String name, int id, int healthLevel, String type, int attackLevelBase, int initiative, int x, int y) {
        super(name, id, healthLevel, type, attackLevelBase, initiative, x, y);
        this.attackLevelBase = attackLevelBase;
    }

    @Override
    public void step(ArrayList<BazeHero> enemies, ArrayList<BazeHero> ours) {

    }

    //
//    public unit.Infantry(int id) {
//        super(id);
//    }
    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID= " + id + " " + "HEALTH= " + healthLevel + " " + " Initiative= " + initiative + " " + "ATTACKLEVELBASE= " + attackLevelBase + " " + "X= " + location.x + "Y= " + location.y);
    }


    @Override
    public void step(ArrayList<BazeHero> enemies) {
        BazeHero temp = finNearEnemi(enemies);
        //System.out.println("LN = " + temp[0] + " ENEMIES NAME" + enemies.get(temp[1]).name);
    }
}