package Java102.PatikaStore.Abstraction;

public interface IProduct {
    public int getId();

    public String getBrand();

    public void setBrand(String name);

    public double getUnitPrice();

    public void setUnitPrice(double unitPrice);

    public double getDiscount();

    public void setDiscount(double discount);

}
