package Java102.MaceraOyunu.Location.Battlefield;

import Java102.MaceraOyunu.Character.Heroes.Hero;
import Java102.MaceraOyunu.Monster.INPC;
import Java102.MaceraOyunu.Monster.Werewolf;

public class Forest extends BattleLoc {
    public Forest(Hero hero) {
        super(5, hero, "ORMAN", "Kütük");
        this.hero = hero;
    }

    @Override
    public boolean onLocation() {
        INPC werewolf = new Werewolf();
        INPC[] beasts = createBeasts(werewolf);
        fight(beasts,hero);

        return super.onLocation();
    }
}
