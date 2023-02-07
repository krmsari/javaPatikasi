package Java102.MaceraOyunu.Location.Battlefield;

import Java102.MaceraOyunu.Character.Heroes.Hero;
import Java102.MaceraOyunu.Character.Inventory;
import Java102.MaceraOyunu.Monster.INPC;
import Java102.MaceraOyunu.Monster.Vampire;
import Java102.MaceraOyunu.Monster.Werewolf;

public class Forest extends BattleLoc {
    public Forest(Hero hero) {
        super(5, hero, "ORMAN", "Kütük");
        this.hero = hero;

    }

    @Override
    public boolean onLocation() {
        if (!inventory.getWood()){
            INPC werewolf = new Werewolf();
            INPC[] beasts = createBeasts(werewolf);
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
