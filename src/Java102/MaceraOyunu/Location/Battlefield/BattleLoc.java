package Java102.MaceraOyunu.Location.Battlefield;

import Java102.MaceraOyunu.AdventureGame;
import Java102.MaceraOyunu.Character.Heroes.Hero;
import Java102.MaceraOyunu.Location.Secure.NormalLoc;
import Java102.MaceraOyunu.Monster.INPC;
import Java102.MaceraOyunu.Monster.NPC;
import Java102.MaceraOyunu.Monster.Zombie;

import java.util.Random;

public class BattleLoc extends NormalLoc {

    protected Random random = new Random();

    protected Hero hero;

    private String loot;

    public BattleLoc(int id, Hero hero, String zoneName, String loot) {
        super(id, hero, zoneName);
        this.loot = loot;
    }

    @Override
    public boolean onLocation() {
        System.out.println(" !! " + getZoneName() + " bölgesindesin dikkatli ol.");
        return super.onLocation();

    }

    public String getLoot() {
        return loot;
    }

    public void setLoot(String loot) {
        this.loot = loot;
    }

    public INPC[] createBeasts(INPC beast) {
        int number = random.nextInt(1, 4);
        INPC[] beasts = new INPC[number];
        for (int i = 0; i < number; i++) {
            beasts[i] = beast;
        }
        System.out.println(beasts.length + " adet " + beasts[0].getName() + " ile karşılaştın." );
        return beasts;
    }

    public void fight(INPC[] beasts, Hero hero) {
        int pcs = beasts.length;
        INPC beast = beasts[0];
        int beastsHealthy = beast.getHealthy() * pcs;
        boolean exit = false;
        while (((hero.getHealthy() > 0) && (beastsHealthy > 0)) && !exit) {
            System.out.println("  1 - Saldır \n  2 - Kaç ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1 -> {
                    beastsHealthy = beastsHealthy - hero.getDamage();
                    System.out.println(" - " + hero.getWeapon().getName() + " ile saldırdın...\n - " + beast.getName() + " canı: " + beastsHealthy );
                    hero.setHealthy(hero.getHealthy() - beast.getDamage());
                    System.out.println(" - " + beast.getName() + " saldırdı... \n - Kalan canın: " +hero.getHealthy());

                }
                case 2 -> {
                    System.out.println("Topuk topuk.");
                    exit = true;
                }
                default -> {
                    System.out.println("Doğru seçim yaptığından emin ol.");
                }
            }
        }
    }
}
