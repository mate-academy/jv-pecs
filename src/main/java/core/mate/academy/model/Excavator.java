package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String name;
    private int fuelConsumption;

    public Excavator() {
    }

    public Excavator(String name, int fuelConsumption) {
        this.name = name;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started working.");
    }
}
