package Java102.MaceraOyunu.Character;

import Java102.MaceraOyunu.Article.Armor;
import Java102.MaceraOyunu.Article.Weapon;

public class Inventory {
    private boolean water;
    private boolean food;
    private boolean wood;
    private Weapon weapon;
    private Armor armor;

    public Inventory(boolean water, boolean food, boolean wood, Weapon weapon, Armor armor) {
        this.water = water;
        this.food = food;
        this.wood = wood;
        this.armor = armor;
        this.weapon = weapon;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
