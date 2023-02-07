package Java102.MaceraOyunu.Article;

public interface IItem {
    int id = 0;
    String name = null;
    int price = 0;
    public int getId();

    public void setId(int id);

    public String getName();

    public void setName(String name);

    public int getPrice();

    public void setPrice(int price);
}
