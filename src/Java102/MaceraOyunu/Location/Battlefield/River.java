package Java102.MaceraOyunu.Location.Battlefield;

import Java102.MaceraOyunu.Character.Heroes.Inheritance.Hero;
import Java102.MaceraOyunu.Monster.Inheritance.INPC;
import Java102.MaceraOyunu.Monster.Vampire;

public class River extends BattleLoc {
    private final Hero hero;
    public River(Hero hero) {
        super(4, hero, "NEHİR");
        this.hero = hero;
        setLoot(inventory.getWater().getName());
    }

    @Override
    public boolean onLocation() {
        if (!inventory.getWater().getPrize()){
            INPC vampire = new Vampire();
            INPC[] beasts = createBeasts(vampire);
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
