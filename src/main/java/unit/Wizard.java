package unit;

import java.util.ArrayList;

public class Wizard extends BazeHero {

    public Wizard(String name,int id,int healthLevel,String type,int attackLevelBase,int initiative,int x, int y,int heal) {
        super(name,healthLevel,id,type,attackLevelBase,initiative,x,y);
        this.heal = heal;
    }

    public int heal;

//    public unit.Wizard(int id) {
//        super(id);
//    }
    //@Override


    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID: " + id + " " + "HEALTH: " + healthLevel + " " + " Initiative: " + initiative + " " + "HEAL: " + heal + " " + "X = " + location.x + " " + "Y= " + location.y);
    }

    @Override
    public void step(ArrayList<BazeHero> enemies) {
        BazeHero temp = finNearEnemi(enemies);
        //System.out.println("LN = " + temp[0] + " ENEMIES NAME" + enemies.get(temp[1]).name);
    }

    public void step(ArrayList<BazeHero> enemies,ArrayList<BazeHero> ours) {
        if(this.healthLevel > 0) {




        for (BazeHero item : ours){
            if ( item.healthLevel < 100) {
                item.healthLevel += this.heal;
                System.out.println("Вылечил: " + item.type);
                return;
            }
        }


            BazeHero temp = finNearEnemi(enemies);
            temp.healthLevel -= this.heal;

    }
}
}

