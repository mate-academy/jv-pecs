package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String typeBySize;

    public Truck() {
    }

    public Truck(String name, String color, String typeBySize) {
        super(name, color);
        this.typeBySize = typeBySize;
    }

    public String getTypeBySize() {
        return typeBySize;
    }

    public void setTypeBySize(String typeBySize) {
        this.typeBySize = typeBySize;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
