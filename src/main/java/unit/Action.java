package unit;

import java.util.ArrayList;

public interface Action {
     void step(ArrayList<BazeHero> enemies,ArrayList<BazeHero> ours);
     String getInfo();


}
