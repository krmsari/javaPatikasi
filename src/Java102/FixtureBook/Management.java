package Java102.FixtureBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Management {
    private List<String> teams = new ArrayList<>();

    public Management(List<String> teams) {
        this.teams = teams;
    }

    public void manag() {
        Random random = new Random();
        listed(teams);
        List<String> winners = new ArrayList<>();
        int j,series=1;
        if (teams.size() % 2 != 0) {
            teams.add("BAY");
            System.out.println("Round: " + series);

            for (int i = 0; i < (teams.size() - 1); i++) {
                j = i + 1;
                if (!teams.get(i).equalsIgnoreCase("BAY") && !teams.get(j).equalsIgnoreCase("BAY")){
                    double rate = random.nextDouble(0,1);
                    System.out.println(teams.get(i) + " - " + teams.get(j));
                    if (rate<0.5){
                        winners.add(teams.get(i));
                        System.out.println("Kazanan: " + teams.get(i));
                    }else {
                        winners.add(teams.get(j));
                        System.out.println("Kazanan: " + teams.get(j));
                    }
                }
                i++;
            }
        }

        listed(winners);
    }

    public void listed(List<String> teams) {
        System.out.println("Takım sayısı: " + teams.size() + "\n\nTakım listesi: ");

        for (String item : teams) {
            System.out.println(" - " + item);
        }
    }

    /*for (int i = 0; i < (teams.size() - 1); i++) {
        j = i + 1;
        System.out.println(teams.get(i) + " " + teams.get(j));
        i++;
    }*/
}
