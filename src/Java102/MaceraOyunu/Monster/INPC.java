package Java102.MaceraOyunu.Monster;

public interface INPC {

    int id = 0;
    String name = null;
    int damage = 0;
    int healthy = 0;
    int coin = 0;

    public int getId();

    public void setId(int id);

    public String getName();

    public void setName(String name);

    public int getDamage();

    public void setDamage(int damage);

    public int getCoin();

    public void setCoin(int coin);

    public int getHealthy();

    public void setHealthy(int healthy);
}
