package Java102.MaceraOyunu.Article;

public class Weapon extends Item{
    private int attack;

    public Weapon(int id, String name, int price, int attack) {
        super(id, name, price);
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
