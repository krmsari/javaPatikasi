package Java102.PatikaStore.Objects;

public class Brand implements Comparable<Brand> {

    private static int nextId = 1;
    private final int id;
    private String name;

    public Brand(String name) {
        this.id = nextId;
        nextId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Brand o) {
        return this.getName().compareTo(o.getName());
    }
}
