package Java102.PatikaStore.Objects;

import Java102.PatikaStore.Abstraction.Product;

public class Notebook extends Product<Notebook> {

    public Notebook(String brand, String description, double unitPrice, double discount, int stock, int memory, double size, int ram) {
        super(brand, description, unitPrice, discount, stock,  memory, size, ram);
    }
}
