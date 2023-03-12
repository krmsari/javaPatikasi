package Java102.FixtureBook;

import java.util.*;

public class Management {
    private List<String> teams = new ArrayList<>();

    public Management(List<String> teams) {
        this.teams = teams;
    }

    public void manag() {
        Random random = new Random();
        listed(teams);
        LinkedHashMap<String, String> winners = new LinkedHashMap<>();
        int j;
        if (teams.size() % 2 != 0) {
            teams.add("BAY");

            for (int i = 0; i < (teams.size()+25); i++) {
                j = i + 1;
                int x = random.nextInt(teams.size()-1);
                int y = random.nextInt(teams.size()-1);
                if (!teams.get(x).equalsIgnoreCase("BAY") && !teams.get(y).equalsIgnoreCase("BAY")); {
                    winners.put(teams.get(x), teams.get(y));
                    System.out.println(x + " - " + y);
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

    public void listed(HashMap<String, String> teams) {
        System.out.println("\n\nTakım listesi: ");
        int series = 1;

        for (String key : teams.keySet()) {
            System.out.println("Round: " + series);
            for (String value : teams.values()) {
                System.out.println(key + " - " + value);
            }
            series++;
        }
    }
    /*for (int i = 0; i < (teams.size() - 1); i++) {
        j = i + 1;
        System.out.println(teams.get(i) + " " + teams.get(j));
        i++;
    }*/
}
