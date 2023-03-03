package core.mate.academy.model;

public class Excavator extends Machine {
    private int crewAmount;
    private int fuelCapacity;
    private int maxWorkHours;

    public Excavator() {
    }

    public Excavator(int crewAmount, int fuelCapacity, int maxWorkHours) {
        this.crewAmount = crewAmount;
        this.fuelCapacity = fuelCapacity;
        this.maxWorkHours = maxWorkHours;
    }

    public int getCrewAmount() {
        return crewAmount;
    }

    public void setCrewAmount(int crewAmount) {
        this.crewAmount = crewAmount;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getMaxWorkHours() {
        return maxWorkHours;
    }

    public void setMaxWorkHours(int maxWorkHours) {
        this.maxWorkHours = maxWorkHours;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
