package Java102.FixtureBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fixture {
    List<Team> teams;
    List<String> fRounds, sRounds;
    private static int sc = 1;

    public Fixture(List<Team> teams) {
        this.teams = teams;
        fRounds = new ArrayList<>();
        sRounds = new ArrayList<>();
    }

    public void generate() {
        Random random = new Random();
        int half = (teams.size() * (teams.size() - 1)) / 2;
        int counter = 0;
        while (counter < half) {
            Team home = teams.get(random.nextInt(teams.size() - 1));
            Team away = teams.get(random.nextInt(teams.size() - 1));

            if (home != away && !fRounds.contains(home.getName() + " - " + away.getName())) {
                fRounds.add(home.getName() + " - " + away.getName());
                sRounds.add(away.getName() + " - " + home.getName());
                counter++;
            }
        }
        display(fRounds);
        display(sRounds);
    }

    public void display(List<String> rounds) {

        for (int i = 0;i<rounds.size();i++) {
            if (i % 3 == 0){
                System.out.println(sc + ". Round: ");
                sc++;
            }
            System.out.println(rounds.get(i));
        }
    }
}
