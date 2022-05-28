package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeWeight;
    private int bladeLength;
    private BulldozerType bulldozerType;

    public Bulldozer(int bladeWeight, int bladeLength, BulldozerType bulldozerType) {
        this.bladeWeight = bladeWeight;
        this.bladeLength = bladeLength;
        this.bulldozerType = bulldozerType;
    }

    public Bulldozer() {
    }

    public int getBladeWeight() {
        return bladeWeight;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public BulldozerType getBulldozerType() {
        return bulldozerType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public enum BulldozerType {
        WITH_SWIVEL_BLADE,
        WITH_NON_SWIVEL_BLADE,
        ROAD_BUILDER
    }
}
