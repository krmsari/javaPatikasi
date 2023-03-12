package Java102.FixtureBook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Galatasaray");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");
        teams.add("Göztepe");
        teams.add("Bursaspor");
        Management management = new Management(teams);
        management.manag();
    }
}
