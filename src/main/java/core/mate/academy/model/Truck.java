package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int cargoWeight;
    private String typeEngine;

    public Truck() {
    }

    public Truck(String name, String color) {
        setName(name);
        setColor(color);
    }

    public Truck(String name, String color, int cargoWeight, String typeEngine) {
        super(name, color);
        this.cargoWeight = cargoWeight;
        this.typeEngine = typeEngine;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
