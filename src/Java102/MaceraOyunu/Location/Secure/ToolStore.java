package Java102.MaceraOyunu.Location.Secure;

import Java102.MaceraOyunu.Article.Armor;
import Java102.MaceraOyunu.Article.Weapon;
import Java102.MaceraOyunu.Character.Heroes.Inheritance.Hero;

import java.util.Objects;

public class ToolStore extends NormalLoc {
    private final Hero hero;

    public ToolStore(Hero hero) {
        super(2, hero, "MAĞAZA");
        this.hero = hero;
    }

    @Override
    public boolean onLocation() {
        System.out.println(" -- Mağazaya girdiniz.");
        System.out.print("    1 - Silahçı\n    2 - Zırhçı\n    3 - Çıkış \nGideceğiniz pazarı seçin: ");

        int choose = scanner.nextInt();
        switch (choose) {
            case 1 -> {
                System.out.println("\n - Silahlar: ");
                Weapon[] weapons = createWeapon();
                setHeroAttack(weapons, hero);
            }
            case 2 -> {
                System.out.println("\n - Zırhlar: ");
                Armor[] armors = createArmor();
                setHeroDefence(armors, hero);
            }
            case 3 -> System.out.println(" - Çıkış yaptınız.");
            default -> System.out.println("\n !! Doğru seçim yapın");
        }
        return true;
    }

    private void setHeroAttack(Weapon[] items, Hero hero) {
        System.out.print(" - Almak istediğin eşyayı seç: ");
        int chooseWeapon = scanner.nextInt();
        for (Weapon i : items) {
            if (i.getId() == chooseWeapon) {
                if (hero.getCoin() >= i.getPrice() && !Objects.equals(i.getName(), hero.getWeapon().getName())) {
                    int newDamage = hero.getDamage() + i.getAttack();
                    System.out.println(" - Buyrun zırhınız.\n" + "Eski saldırı değerin: " + hero.getDamage() + "\nYeni saldırı değerin: " + newDamage + "\n Kalan altınınız: " + hero.getCoin());
                    hero.setCoin(hero.getCoin() - i.getPrice());
                    System.out.println("\n - Kalan altınınız: " + hero.getCoin());
                    hero.setWeapon(i);
                    hero.setDamage(newDamage);
                } else if (Objects.equals(i.getName(), hero.getWeapon().getName())) {
                    System.out.println("Aynı ürünü tekrar alamazsın.");
                } else {
                    System.out.println("  -- Altınınız bu ürün için yeterli değil.");
                }
            }
        }
    }

    private void setHeroDefence(Armor[] items, Hero hero) {
        System.out.print(" - Almak istediğin eşyayı seç: ");
        int chooseArmor = scanner.nextInt();
        for (Armor i : items) {
            if (i.getId() == chooseArmor) {
                if (hero.getCoin() >= i.getPrice() && !Objects.equals(i.getName(), hero.getArmor().getName())) {
                    int newDefence = hero.getHealthy() + i.getDefence();
                    hero.setCoin(hero.getCoin() - i.getPrice());
                    hero.setHealthy(newDefence);
                    System.out.println(" - Buyrun zırhınız. \n" + "Eski savunma değerin: " + hero.getHealthy() + "\nYeni savunma değerin: " + newDefence + "\n Kalan altınınız: " + hero.getCoin());
                    hero.setArmor(i);
                } else if (Objects.equals(i.getName(), hero.getArmor().getName())) {
                    System.out.println("Aynı ürünü tekrar alamazsın.");
                } else {
                    System.out.println(" - Altınınız bu ürün için yeterli değil. Altınınız: " + hero.getCoin());
                }
            }
        }
    }

    private Weapon[] createWeapon() {
        //WEAPONS
        Weapon gun = new Weapon(1, "Tabanca", 15, 2);
        Weapon sword = new Weapon(2, "Kılıç", 30, 3);
        Weapon rifle = new Weapon(3, "Tüfek", 40, 7);
        Weapon[] weapons = new Weapon[]{gun, sword, rifle};
        for (Weapon w : weapons) {
            System.out.println("\n" + w.getId() + ". Silah: " + w.getName() + "\n Saldırı gücü: " + w.getAttack() + "\n Fiyatı: " + w.getPrice());
        }
        System.out.println( "\n Altınınız: " + hero.getCoin());
        return weapons;
    }

    private Armor[] createArmor() {
        //ARMORS

        Armor light = new Armor(1, "Hafif Zırh", 15, 1);
        Armor mid = new Armor(2, "Orta Zırh", 25, 5);
        Armor heavy = new Armor(3, "Ağır Zırh", 35, 7);
        Armor[] armors = new Armor[]{light, mid, heavy};
        for (Armor a : armors) {
            System.out.println("\n" + a.getId() + ". Zırh: " + a.getName() + "\n Savunma: " + a.getDefence() + "\n Fiyatı: " + a.getPrice());
        }
        System.out.println( "\n Altınınız: " + hero.getCoin());
        return armors;
    }
}
