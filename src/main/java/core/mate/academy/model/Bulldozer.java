package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int maxRange;
    private String fuelType;

    public Bulldozer() {
    }

    public Bulldozer(int maxRange, String fuelType) {
        this.maxRange = maxRange;
        this.fuelType = fuelType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
