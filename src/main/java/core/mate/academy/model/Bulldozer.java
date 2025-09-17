package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String brand;
    private int maxWeight;
    private int maxPower;

    public Bulldozer() {
    }

    public Bulldozer(String brand, int maxWeight, int maxPower) {
        this.brand = brand;
        this.maxWeight = maxWeight;
        this.maxPower = maxPower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
