import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[]args){
        BazeHero shao = new Monk(95);
        BazeHero goba = new Infantry(77);
        BazeHero chang = new Shooter(78);
        BazeHero sirius = new Wizard(80);
        Peasant boris = new Peasant(22, 50, "Boris");

        System.out.println(shao.getInfo());
        System.out.println(goba.getInfo());
        System.out.println(chang.getInfo());
        System.out.println(sirius.getInfo());
        System.out.println(boris.getInfo());

        ArrayList<BazeHero> allHeroes =  new ArrayList<>();


        allHeroes.add(shao);
        allHeroes.add(goba);
        allHeroes.add(chang);
        allHeroes.add(sirius);
        //allHeroes.add(boris);

        ArrayList<BazeHero> team1 =  new ArrayList<>();
        ArrayList<BazeHero> team2 =  new ArrayList<>();

        for (int i = 0; i < 10;i++){
            int n = new Random().nextInt(7);
            switch (n){
                case 0: team1.add(new Monk(6));
                break;
                case 1: team1.add(new Infantry(4));
                break;
                case 3:
                    boolean add = team1.add(new Wizard(3));

            }
//            team1.add(allHeroes.get(new Random().nextInt(0, allHeroes.size())));
            team2.add(allHeroes.get(new Random().nextInt(0, allHeroes.size())));
        }
        team1.forEach(i -> System.out.println(i.getInfo()));
        team2.forEach(i -> System.out.println(i.getInfo()));
    }

}
