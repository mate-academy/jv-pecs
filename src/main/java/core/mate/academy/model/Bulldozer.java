package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String cabinDimensions;
    private String cabinFunctions;
    private int fuelTankSize;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String cabinDimensions,
                     String cabinFunctions, int fuelTankSize) {
        super(name, color);
        this.cabinDimensions = cabinDimensions;
        this.cabinFunctions = cabinFunctions;
        this.fuelTankSize = fuelTankSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getCabinDimensions() {
        return cabinDimensions;
    }

    public void setCabinDimensions(String cabinDimensions) {
        this.cabinDimensions = cabinDimensions;
    }

    public String getCabinFunctions() {
        return cabinFunctions;
    }

    public void setCabinFunctions(String cabinFunctions) {
        this.cabinFunctions = cabinFunctions;
    }

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public void setFuelTankSize(int fuelTankSize) {
        this.fuelTankSize = fuelTankSize;
    }
}
