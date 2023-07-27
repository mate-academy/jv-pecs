package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int cargoWeight;

    public Truck() {
    }

    public Truck(String name, String color, int cargoWeight) {
        setName(name);
        setColor(color);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
