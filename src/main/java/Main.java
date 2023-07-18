
package unit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BazeHero shao = new Monk("Shao", 5, 100, "Monk", 7, 7, 1, 5, 10);
        BazeHero goba = new Infantry("Goba", 3, 100, "Infantry", 6, 7, 1, 9);
        BazeHero chang = new Shooter("Chang", 100, 4, "Shooter", 7, 8, 10, 1, 7);
        BazeHero sirius = new Wizard("Sirius", 7, 100, "Wizard", 7, 8, 1, 8, 9);
        Peasant boris = new Peasant("Boris", 2, 100, 4, 1, 6);

        System.out.println(shao.getInfo());
        System.out.println(goba.getInfo());
        System.out.println(chang.getInfo());
        System.out.println(sirius.getInfo());
        System.out.println(boris.getInfo());

        ArrayList<BazeHero> allHeroes = new ArrayList<>();


        allHeroes.add(shao);
        allHeroes.add(goba);
        allHeroes.add(chang);
        allHeroes.add(sirius);
        //allHeroes.add(boris);

        ArrayList<BazeHero> team1 = new ArrayList<>();
        ArrayList<BazeHero> team2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int n = new Random().nextInt(7);

            switch (n) {
                case 0:
                    team1.add(new Monk("Shao", 1, 100, "Monk", 6, 5, 1, new Random().nextInt(50), 6));
                    //break;
                case 1:
                    team1.add(new Infantry("Goba", 4, 100, "Infantry", 6, 6, 1, new Random().nextInt(50)));
                    //break;
                case 3:
                    team1.add(new Wizard("Sirius", 2, 100, "Wizard", 7, 7, 1, new Random().nextInt(50), 8));

                case 4:
                    team1.add(new Peasant("Boris", 23, 50, 4, 1, new Random().nextInt(50)));
                    //break;
                default:
                    team1.add(new Shooter("Chang", 3, 100, "Chang", 7, 8, 10, 1, new Random().nextInt(50)));
                    //break;
            }
            for (int j = 0; j < 10; j++) {
                int m = new Random().nextInt(7);
                switch (m) {
                    case 0:
                        team2.add(new Monk("Shao", 5, 100, "Monk", 6, 5, 9, new Random().nextInt(50), 6));
                        //break;
                    case 1:
                        team2.add(new Infantry("Goba", 6, 100, "Infantry", 6, 8, 9, new Random().nextInt(50)));
                        //break;
                    case 3:
                        team2.add(new Wizard("Sirius", 7, 100, "Wizard", 7, 7, 9, new Random().nextInt(50), 8));

                    case 4:
                        team2.add(new Peasant("Boris", 22, 50, 4, 9, new Random().nextInt(50)));
                        //break;
                    default:
                        team2.add(new Shooter("Chang", 8, 100, "Chang", 7, 8, 9, 1, new Random().nextInt(50)));
                }
            }
//            team1.add(allHeroes.get(new Random().nextInt(0, allHeroes.size())));
            //team2.add(allHeroes.get(new Random().nextInt(0, allHeroes.size())));
        }
        //team1.forEach(item -> System.out.println(item.getInfo()));
        //team2.forEach(item -> System.out.println(item.getInfo()));
        ArrayList<BazeHero> unitedTeam = new ArrayList<>();
        unitedTeam.addAll(team1);
        unitedTeam.addAll(team2);
        unitedTeam.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative());

        System.out.println("Team1: ");
        team1.forEach(item -> System.out.println(item.getInfo()));
        System.out.println("Team2: ");
        team2.forEach(item -> System.out.println(item.getInfo()));


        //unitedTeam.forEach(item -> item.step(team2,team1));
        //unitedTeam.forEach(item -> item.step(team1,team2));
        for (BazeHero item : unitedTeam) {
            if (team1.contains(item)) {
                item.step(team2, team1);
            } else {
                item.step(team1, team2);
            }
            System.out.println(item.getInitiative());
        }

            System.out.println("-".repeat(55));

            team1.forEach(item -> System.out.println(item.getInfo()));
            team2.forEach(item -> System.out.println(item.getInfo()));


        }

    }

