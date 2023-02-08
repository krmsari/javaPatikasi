package Java102.MaceraOyunu.Location.Secure;

import Java102.MaceraOyunu.Character.Heroes.Inheritance.Hero;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Hero hero) {
        super(1, hero,"GÜVENLİ EV");
    }

    @Override
    public boolean onLocation() {
        int newHealthy = getHero().getHealthy() + 2;
        System.out.println(" - Güvenli ev bölgesine girdiniz.\n - Canınız yenilendi, yeni can değeriniz: " + newHealthy);

        return true;
    }
}
