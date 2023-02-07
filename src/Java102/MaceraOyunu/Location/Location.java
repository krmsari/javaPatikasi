package Java102.MaceraOyunu.Location;

import Java102.MaceraOyunu.Character.Heroes.Hero;

import java.util.Scanner;

public abstract class Location{
    private int id;
    private Hero hero;
    private String zoneName;
    protected Scanner scanner = new Scanner(System.in);

    public Location(int id, Hero hero, String zoneName) {
        this.id = id;
        this.hero = hero;
        this.zoneName = zoneName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public abstract boolean onLocation();
}
