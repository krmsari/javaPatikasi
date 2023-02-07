package Java102.MaceraOyunu.Location.Battlefield;

import Java102.MaceraOyunu.Character.Heroes.Hero;
import Java102.MaceraOyunu.Monster.INPC;
import Java102.MaceraOyunu.Monster.Zombie;


public class Cave extends BattleLoc {
    public Cave(Hero hero) {
        super(3, hero, "MAĞARA", "Yemek");
        this.hero = hero;
    }

    @Override
    public boolean onLocation() {

        INPC zombie = new Zombie();
        INPC[] beasts = createBeasts(zombie);
        fight(beasts,hero);

        return super.onLocation();
    }
}
