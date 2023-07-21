package unit;

import java.util.ArrayList;

public class Shooter extends BazeHero {
    public Shooter(String name,int healthLevel,int id,String type,int attackLevelBase,int initiative,int shoots,int x,int y) {
        super(name,healthLevel,id,type,attackLevelBase,initiative,x,y);
        this.attackLevelBase = attackLevelBase;
        this.shoots = shoots;
    }

    public int attackLevelBase;
    protected int shoots;

    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID: " + id + " " + "HEALTH: " + healthLevel + " " + " Initiative: " + initiative +" " + "ATTACKLEVELBASE: " + attackLevelBase + " " + "SHOOTS = " +" "+ "X= " + location.x + " " + "Y=" + location.y );

    }

    @Override
    public void step(ArrayList<BazeHero> enemies,ArrayList<BazeHero> ours) {
        if(this.healthLevel <=0) return;
        if(this.shoots == 0) return;

        BazeHero temp = finNearEnemi(enemies);
        temp.healthLevel = temp.healthLevel - this.attackLevelBase;

        for (BazeHero item : ours){
            if (item.type.contains("Peasant")&& !((Peasant)(item)).busy && item.healthLevel > 0) {
                ((Peasant)(item)).busy = true;
                return;
            }
        }
        this.shoots --;
    }
}
