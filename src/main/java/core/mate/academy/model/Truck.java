package core.mate.academy.model;

public class Truck extends Machine {
    private int carryingCapacity;
    private int fullMass;

    public Truck() {
    }

    public Truck(String name, String color, int carryingCapacity, int fullMass) {
        this.setName(name);
        this.setColor(color);
        this.carryingCapacity = carryingCapacity;
        this.fullMass = fullMass;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getFullMass() {
        return fullMass;
    }

    public void setFullMass(int fullMass) {
        this.fullMass = fullMass;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
