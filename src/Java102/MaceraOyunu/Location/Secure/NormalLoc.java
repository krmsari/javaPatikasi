package Java102.MaceraOyunu.Location.Secure;

import Java102.MaceraOyunu.Character.Heroes.Hero;
import Java102.MaceraOyunu.Location.Location;

public class NormalLoc extends Location {

    public NormalLoc(int id, Hero hero, String zoneName) {
        super(id, hero, zoneName);
    }

    @Override
    public boolean onLocation() {

        return true;
    }
}
