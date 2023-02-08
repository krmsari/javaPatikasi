package Java102.MaceraOyunu.Prizes.Inheritance;

public abstract class Prize implements IPrize {

    private boolean isThere;
    private String name;

    public Prize(String name,boolean isThere) {
        this.name = name;
        this.isThere = isThere;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrize(boolean prize) {
        this.isThere = prize;
    }

    @Override
    public boolean getPrize() {
        return isThere;
    }
}
