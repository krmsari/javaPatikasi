package Java102.MaceraOyunu.Location.Secure;

import Java102.MaceraOyunu.Character.Heroes.Inheritance.Hero;
import Java102.MaceraOyunu.Location.Inheritance.Location;

public class NormalLoc extends Location {

    public NormalLoc(int id, Hero hero, String zoneName) {
        super(id, hero, zoneName);
    }

    @Override
    public boolean onLocation() {

        return true;
    }
}
