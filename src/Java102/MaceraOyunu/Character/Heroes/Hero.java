package Java102.MaceraOyunu.Character.Heroes;

import Java102.MaceraOyunu.Article.Armor;
import Java102.MaceraOyunu.Article.Weapon;
import Java102.MaceraOyunu.Character.Inventory;

public abstract class Hero {
    private int id;
    private String heroName;
    private int damage;
    private int healthy;
    private int coin;

    private Inventory inventory;
    private Weapon weapon = new Weapon(0,"Yumruk",0,0);
    private Armor armor = new Armor(0,"",0,0);

    public Hero(int id,String heroName, int damage, int healthy, int coin) {
        this.id = id;
        this.heroName = heroName;
        this.damage = damage;
        this.healthy = healthy;
        this.coin = coin;
        this.inventory = new Inventory(false,false,false,weapon,armor);
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
