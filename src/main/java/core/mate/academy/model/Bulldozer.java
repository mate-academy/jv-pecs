package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int maxHorsePower;
    private String bulldozerSize;

    public Bulldozer(int maxPowerHp, String sizeBsl) {
        this.maxHorsePower = maxPowerHp;
        this.bulldozerSize = sizeBsl;
    }

    public Bulldozer() {
    }

    public int getMaxHorsePower() {
        return maxHorsePower;
    }

    public void setMaxHorsePower(int maxHorsePower) {
        this.maxHorsePower = maxHorsePower;
    }

    public String getBulldozerSize() {
        return bulldozerSize;
    }

    public void setBulldozerSize(String bulldozerSize) {
        this.bulldozerSize = bulldozerSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
