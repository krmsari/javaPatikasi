package Java102.MaceraOyunu.Location.Battlefield;

import Java102.MaceraOyunu.Character.Heroes.Hero;
import Java102.MaceraOyunu.Character.Inventory;
import Java102.MaceraOyunu.Monster.INPC;
import Java102.MaceraOyunu.Monster.Vampire;
import Java102.MaceraOyunu.Monster.Zombie;


public class Cave extends BattleLoc {
    public Cave(Hero hero) {
        super(3, hero, "MAĞARA", "Yemek");
        this.hero = hero;
    }


    @Override
    public boolean onLocation() {

        if (!inventory.getFood()){
            INPC zombie = new Zombie();
            INPC[] beasts = createBeasts(zombie);
            fight(beasts,hero,getLoot());
        }else {
            System.out.println("\n  - Galiba buraya daha önce gelmiştim tüm canavarlar ölmüş.\n ! Diğer bölgelere gitmeliyim.");
        }
        if (hero.getHealthy()<0){
            return false;
        }
        return super.onLocation();
    }
}
