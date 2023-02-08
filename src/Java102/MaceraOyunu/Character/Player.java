package Java102.MaceraOyunu.Character;

import Java102.MaceraOyunu.Character.Heroes.*;
import Java102.MaceraOyunu.Character.Heroes.Inheritance.Hero;

import java.util.Scanner;

public class Player {

    private final Hero playerHero = new SelectedHero(0, "", 0, 0, 0);
    Scanner scanner = new Scanner(System.in);

    public void showHeroes(Hero[] heroesArr) {
        for (Hero h : heroesArr) {
            System.out.println("\n" + h.getId() + ". Karakter: " + h.getHeroName() + "\n Can: " + h.getHealthy() + "\n Hasar: " + h.getDamage() + "\n Altın: " + h.getCoin());
        }
    }

    public void selectChar() {
        Hero samurai = new Samurai();
        Hero archer = new Archer();
        Hero knight = new Knight();
        Hero wizard = new Wizard();
        Hero[] heroes = new Hero[]{samurai, archer, knight, wizard};
        showHeroes(heroes);
        System.out.print("\nOluşturmak istediğin karakteri seç: ");
        int selectedId = scanner.nextInt();
        for (Hero h : heroes) {
            if (selectedId == h.getId()) {
                selectedHero(h);
                break;
            }
        }
    }

    public void selectedHero(Hero hero) {
        playerHero.setId(hero.getId());
        playerHero.setHeroName(hero.getHeroName());
        playerHero.setDamage(hero.getDamage());
        playerHero.setHealthy(hero.getHealthy());
        playerHero.setCoin(hero.getCoin());
        System.out.print("\n - Karakterin: " + playerHero.getHeroName() + " olarak belirlendi.\n");
    }

    public Hero getHero() {
        return playerHero;
    }
}
