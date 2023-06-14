package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String engineType;

    public Truck() {
    }

    public Truck(String name, String color, String engineType) {
        setName(name);
        setColor(color);
        this.engineType = engineType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
