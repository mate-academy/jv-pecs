package core.mate.academy.model;

public class Truck extends Machine {
    private int fuelConsumption;

    public Truck() {
    }

    public Truck(String name, String color, int fuelConsumption) {
        setName(name);
        setColor(color);
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
