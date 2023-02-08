package Java102.MaceraOyunu.Location.Battlefield;

import Java102.MaceraOyunu.Location.Secure.NormalLoc;
import Java102.MaceraOyunu.Character.Heroes.Inheritance.Hero;
import Java102.MaceraOyunu.Character.Inventory;
import Java102.MaceraOyunu.Monster.Inheritance.INPC;

import java.util.Objects;
import java.util.Random;

public class BattleLoc extends NormalLoc {

    protected Random random = new Random();

    protected Hero hero;

    private String loot;
    protected Inventory inventory;

    public BattleLoc(int id, Hero hero, String zoneName) {
        super(id, hero, zoneName);
        this.hero = hero;
        inventory = hero.getInventory();
    }

    @Override
    public boolean onLocation() {

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
        System.out.println(beasts.length + " adet " + beasts[0].getName() + " ile karşılaştın.");
        return beasts;
    }

    public void fight(INPC[] beasts, Hero hero, String lootName) {
        System.out.println(" !! " + getZoneName() + " bölgesindesin dikkatli ol.");
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
                    System.out.println(" - " + hero.getWeapon().getName() + " ile saldırdın...\n - " + beast.getName() + " canı: " + beastsHealthy);
                    hero.setHealthy(hero.getHealthy() - beast.getDamage());
                    System.out.println(" - " + beast.getName() + " saldırdı... \n - Kalan canın: " + hero.getHealthy());

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
        if (hero.getHealthy() <= 0) {
            System.out.println("\n ! Ah dostum " + beasts.length + " " + beast.getName() + " seni mağlup etti. ");

        } else if (beastsHealthy <= 0) {
            System.out.println("\n ! " + beasts.length + " " + beast.getName() + " öldü, ödülünü al: " + lootName);
            setTrue(lootName);
            int earnCoin = beasts.length * beast.getCoin();
            hero.setCoin(hero.getCoin() + earnCoin);
            System.out.println(" - Alt edilen " + beasts.length + " " + beast.getName() + " " + earnCoin + " altın düşürdü.\n" +
                    " Toplam altının: " + hero.getCoin());
        }
    }


    private void setTrue(String loot) {
        if (Objects.equals(loot, "Yemek")) {
            inventory.getFood().setPrize(true);
        } else if (Objects.equals(loot, "Su")) {
            inventory.getWater().setPrize(true);
        } else if (Objects.equals(loot, "Odun")) {
            inventory.getWood().setPrize(true);



        }
    }

}
