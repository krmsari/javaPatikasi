package Java102.MaceraOyunu.Location.Battlefield;

import Java102.MaceraOyunu.Character.Heroes.Hero;
import Java102.MaceraOyunu.Monster.INPC;
import Java102.MaceraOyunu.Monster.Vampire;
import Java102.MaceraOyunu.Monster.Werewolf;
import Java102.MaceraOyunu.Monster.Zombie;

public class River extends BattleLoc {
    private final Hero hero;
    public River(Hero hero) {
        super(4, hero, "NEHİR", "Su");
        this.hero = hero;

    }

    @Override
    public boolean onLocation() {
        INPC vampire = new Vampire();
        INPC[] beasts = createBeasts(vampire);
        fight(beasts,hero);
        return super.onLocation();
    }
}
