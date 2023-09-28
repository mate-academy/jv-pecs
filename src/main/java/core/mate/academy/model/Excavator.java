package core.mate.academy.model;

public class Excavator extends Machine {
    private int fuelConsumptionPerHour;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getFuelConsumptionPerHour() {
        return fuelConsumptionPerHour;
    }

    public void setFuelConsumptionPerHour(int fuelConsumptionPerHour) {
        this.fuelConsumptionPerHour = fuelConsumptionPerHour;
    }
}
