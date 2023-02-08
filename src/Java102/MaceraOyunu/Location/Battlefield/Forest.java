package Java102.MaceraOyunu.Location.Battlefield;

import Java102.MaceraOyunu.Character.Heroes.Inheritance.Hero;
import Java102.MaceraOyunu.Monster.Inheritance.INPC;
import Java102.MaceraOyunu.Monster.Werewolf;

public class Forest extends BattleLoc {
    public Forest(Hero hero) {
        super(5, hero, "ORMAN");
        this.hero = hero;
        setLoot(inventory.getWood().getName());
    }

    @Override
    public boolean onLocation() {
        if (!inventory.getWood().getPrize()){
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
