package unit;

import java.util.ArrayList;

public class Infantry extends BazeHero {

    public Infantry(String name, int id, int healthLevel, String type, int attackLevelBase, int initiative, int x, int y) {
        super(name, id, healthLevel, type, attackLevelBase, initiative, x, y);
        this.attackLevelBase = attackLevelBase;
    }

    @Override
    public void step(ArrayList<BazeHero> enemies, ArrayList<BazeHero> ours) {
        if(this.healthLevel <= 0) return;
        BazeHero nearestEnemi = finNearEnemi(enemies);
        if (this.location.calcDistance(nearestEnemi.location) < 2){
            nearestEnemi.getDamage(this.attackLevelBase);
            return;
        }

        Coordinates tmpc = new Coordinates(location.x,location.y);
        if (Math.abs(this.location.x - nearestEnemi.location.x) > Math.abs(this.location.y - nearestEnemi.location.y)){
            if (this.location.x < nearestEnemi.location.x){
                tmpc.x += 1;

            }
            else {
                tmpc.x -= 1;
            }

        }else {
            if (this.location.y < nearestEnemi.location.y){
                tmpc.y += 1;
            }
            else {
                tmpc.y -= 1;
            }
        }

        boolean flag = false;
        for (BazeHero item : ours) {
            if (item.location.x == tmpc.x & item.location.y == tmpc.y & item.healthLevel > 0) flag = true;
        }
        if (flag) return;
        this.location.x = tmpc.x;
        this.location.y = tmpc.y;

    }


    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID= " + id + " " + "HEALTH= " + healthLevel + " " + " Initiative= " + initiative + " " + "ATTACKLEVELBASE= " + attackLevelBase + " " + "X= " + location.x + "Y= " + location.y);
    }


    @Override
    public void step(ArrayList<BazeHero> enemies) {
        BazeHero temp = finNearEnemi(enemies);
        //System.out.println("LN = " + temp[0] + " ENEMIES NAME" + enemies.get(temp[1]).name);
    }
}