package Java102.MaceraOyunu.Character.Heroes.Inheritance;

import Java102.MaceraOyunu.Article.Armor;
import Java102.MaceraOyunu.Article.Weapon;
import Java102.MaceraOyunu.Character.Inventory;
import Java102.MaceraOyunu.Prizes.Food;
import Java102.MaceraOyunu.Prizes.Inheritance.Prize;
import Java102.MaceraOyunu.Prizes.Water;
import Java102.MaceraOyunu.Prizes.Wood;

public abstract class Hero {
    private int id;
    private String heroName;
    private int damage;
    private int healthy;
    private int coin;

    private Inventory inventory;
    private Weapon weapon = new Weapon(0,"Yumruk",0,0);
    private Armor armor = new Armor(0,"",0,0);
    private Prize prize;

    public Hero(int id,String heroName, int damage, int healthy, int coin) {
        this.id = id;
        this.heroName = heroName;
        this.damage = damage;
        this.healthy = healthy;
        this.coin = coin;

        this.inventory = new Inventory(new Water(),new Food(),new Wood(),weapon,armor);
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
    public String getHeroName() {
        return heroName;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getCoin() {
        return coin;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}
