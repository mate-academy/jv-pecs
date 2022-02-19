package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String fuelType;
    private int weight;
    private int numberOfBlades;
    private int serialNumber;

    public Bulldozer(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Bulldozer() {
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfBlades() {
        return numberOfBlades;
    }

    public void setNumberOfBlades(int numberOfBlades) {
        this.numberOfBlades = numberOfBlades;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
