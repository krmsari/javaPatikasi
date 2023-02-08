package Java102.MaceraOyunu.Character;

import Java102.MaceraOyunu.Article.Weapon;
import Java102.MaceraOyunu.Article.Armor;
import Java102.MaceraOyunu.Prizes.Inheritance.Prize;

public class Inventory {
    private final Prize water;
    private final Prize food;
    private final Prize wood;
    private Weapon weapon;
    private Armor armor;

    public Inventory(Prize water, Prize food, Prize wood, Weapon weapon, Armor armor) {
        this.water = water;
        this.food = food;
        this.wood = wood;
        this.armor = armor;
        this.weapon = weapon;
    }

    public void setFood(boolean food) {
        this.food.setPrize(food);
    }
    public Prize getFood(){
        return food;
    }
    public void setWater(boolean water) {
        this.water.setPrize(water);
    }

    public Prize getWater(){
        return water;
    }
    public void setWood(boolean wood) {
        this.wood.setPrize(wood);
    }
    public Prize getWood(){
        return wood;
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
