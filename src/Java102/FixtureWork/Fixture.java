package Java102.FixtureWork;

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
        if (teams.size() % 2 == 0) {
            while (counter < half) {
                Team home = teams.get(random.nextInt(teams.size()));
                Team away = teams.get(random.nextInt(teams.size()));

                if (home != away && !fRounds.contains(home.getName() + " - " + away.getName()) && away.getId() != 0 && home.getId() != 0) {
                    fRounds.add(home.getName() + " - " + away.getName());
                    sRounds.add(away.getName() + " - " + home.getName());
                    counter++;
                }

            }
        } else {

            teams.add(new Team(0, "BAYTTTTTTTTTTT"));

            while (counter < half) {
                Team home = teams.get(random.nextInt(teams.size()));
                Team away = teams.get(random.nextInt(teams.size()));

                if (home != away && !fRounds.contains(home.getName() + " - " + away.getName()) && away.getId() != 0 && home.getId() != 0) {
                    fRounds.add(home.getName() + " - " + away.getName());
                    sRounds.add(away.getName() + " - " + home.getName());
                    counter++;
                }

            }
        }
        display(fRounds);
        display(sRounds);

    }

    public void display(List<String> rounds) {

        for (int i = 0; i < rounds.size(); i++) {
            if (i % 3 == 0) {
                System.out.println("\n " + sc + ". Round: ");
                sc++;
            }

            System.out.println(rounds.get(i));

        }
    }
}
