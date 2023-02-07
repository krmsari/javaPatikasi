package Java102.MaceraOyunu.Monster;

public abstract class NPC implements INPC {
    private int id;
    private String name;
    private int damage;
    private int healthy;
    private int coin;

    public NPC(int id, String name, int damage, int healthy, int coin) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.healthy = healthy;
        this.coin = coin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }
}
