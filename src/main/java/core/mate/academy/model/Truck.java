package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int loadCapacity;
    private String typeOfFuel;

    public Truck() {
        super("Default name", "Default color");
    }

    public Truck(String name, String color, int loadCapacity, String typeOfFuel) {
        super(name, color);
        this.loadCapacity = loadCapacity;
        this.typeOfFuel = typeOfFuel;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
