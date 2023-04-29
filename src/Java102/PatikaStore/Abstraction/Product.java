package Java102.PatikaStore.Abstraction;


public abstract class Product<T> implements IProduct {
    private final int id;
    private static int nextId = 1;
    private String brand;
    private double unitPrice;
    private double discount;
    private int stock;
    private String description;
    private int memory;
    private double size;
    private int ram;

    IProduct product;

    public Product(String brand, String description, double unitPrice, double discount, int stock, int memory, double size, int ram) {
        this.id = nextId;
        nextId++;
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.stock = stock;
        this.description = description;
        this.memory = memory;
        this.size = size;
        this.ram = ram;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}
