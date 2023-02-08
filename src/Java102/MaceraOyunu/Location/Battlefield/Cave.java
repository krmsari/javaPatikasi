package Java102.MaceraOyunu.Location.Battlefield;

import Java102.MaceraOyunu.Character.Heroes.Inheritance.Hero;
import Java102.MaceraOyunu.Monster.Inheritance.INPC;
import Java102.MaceraOyunu.Monster.Zombie;


public class Cave extends BattleLoc {


    public Cave(Hero hero) {
        super(3, hero, "MAĞARA");
        this.hero = hero;
        setLoot(inventory.getFood().getName());
    }


    @Override
    public boolean onLocation() {

        if (!inventory.getFood().getPrize()){
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
