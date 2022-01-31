package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int fuelConsumptionPerHour;
    private int power;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getFuelConsumptionPerHour() {
        return fuelConsumptionPerHour;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setFuelConsumptionPerHour(int fuelConsumptionPerHour) {
        this.fuelConsumptionPerHour = fuelConsumptionPerHour;
    }
}
