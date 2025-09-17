package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String brand;
    private int capeLength;
    private int maxPower;

    public Excavator(String brand, int capeLength, int maxPower) {
        this.brand = brand;
        this.capeLength = capeLength;
        this.maxPower = maxPower;
    }

    public Excavator() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapeLength() {
        return capeLength;
    }

    public void setCapeLength(int capeLength) {
        this.capeLength = capeLength;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
