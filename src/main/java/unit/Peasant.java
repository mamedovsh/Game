package unit;

import java.util.ArrayList;

public class Peasant extends BazeHero {
    int id;
    int healthLevel;
    String name;
    int x;
    int y;


    public Peasant(String name,int id, int healthLevel,int x,int y) {
        super("Boris",12,50,"unit.Peasant",0,0,4,5);
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.x = x;
        this.y = y;

    }

    @Override
    public void step(ArrayList<BazeHero> enemies) {
        int [] temp = finNearEnemi(enemies);
        System.out.println("LN = " + temp[0] + "E NEMIES NAME" + enemies.get(temp[1]).name);
    }

    public String getInfo(){
        return ("NAME: " + name + " " +  "ID: " + id + " " + "HEALTH: " + healthLevel + " " );
    }
}
