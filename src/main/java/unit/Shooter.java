package unit;

import java.util.ArrayList;

public class Shooter extends BazeHero {
    public Shooter(String name,int healthLevel,int id,String type,int attackLevelBase,int initiative,int x,int y) {
        super(name,healthLevel,id,type,attackLevelBase,initiative,x,y);
        this.attackLevelBase = attackLevelBase;
    }

    public int attackLevelBase;

    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID: " + id + " " + "HEALTH: " + healthLevel + " " + " Initiative: " + initiative +" " + "ATTACKLEVELBASE: " + attackLevelBase + "X= " + location.x + " " + "Y=" + location.y );

    }

    @Override
    public void step(ArrayList<BazeHero> enemies) {
        int [] temp = finNearEnemi(enemies);
        System.out.println("LN = " + temp[0] + " ENEMIES NAME" + enemies.get(temp[1]).name);
    }
}
