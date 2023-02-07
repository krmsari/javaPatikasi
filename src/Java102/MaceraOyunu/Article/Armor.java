package Java102.MaceraOyunu.Article;

public class Armor extends Item{
    private int defence;

    public Armor(int id, String name, int price, int defence) {
        super(id, name, price);
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
