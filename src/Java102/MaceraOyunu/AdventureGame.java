package Java102.MaceraOyunu;

import Java102.MaceraOyunu.Character.Heroes.Hero;
import Java102.MaceraOyunu.Character.Player;
import Java102.MaceraOyunu.Location.Battlefield.Cave;
import Java102.MaceraOyunu.Location.Battlefield.Forest;
import Java102.MaceraOyunu.Location.Battlefield.River;
import Java102.MaceraOyunu.Location.Location;
import Java102.MaceraOyunu.Location.Secure.SafeHouse;
import Java102.MaceraOyunu.Location.Secure.ToolStore;

import java.util.Scanner;

public class AdventureGame {
    private final Player player = new Player();
    protected Scanner scanner = new Scanner(System.in);

    public void start(){
        Player character = new Player();
        character.selectChar();
        Hero gamer = character.getHero();
        selectedLocation(gamer);

    }
    public void selectedLocation(Hero hero) {
        Location location = null;

        while(true){
            SafeHouse safeHouse = new SafeHouse(hero);
            ToolStore toolStore = new ToolStore(hero);
            River river = new River(hero);
            Cave cave = new Cave(hero);
            Forest forest = new Forest(hero);

            Location[] locations = new Location[]{safeHouse, toolStore,cave,river,forest};
            showLocations(locations);
            System.out.print("\nGireceğiniz bölgeyi seçin: ");
            int selectedLocation = scanner.nextInt();
            for (Location l : locations) {
                if (l.getId() == selectedLocation) {
                    location = l;
                }
            }
            if (!location.onLocation()){
                System.out.println("Öldünüz.");
                break;
            }
        }


    }

    public void showLocations(Location[] locationsArr) {
        for (Location l : locationsArr) {
            System.out.println("\n" + l.getId() + ". Bölge: " + l.getZoneName());
        }
    }
}
