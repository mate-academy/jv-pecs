package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String manufacturersOfBulldozer;
    private String type;
    private String bladeType;
    private boolean offRoadTires;

    public Bulldozer(String manufacturersOfBulldozer,
                     String type,
                     String bladeType, boolean offRoadTires) {
        this.manufacturersOfBulldozer = manufacturersOfBulldozer;
        this.type = type;
        this.bladeType = bladeType;
        this.offRoadTires = offRoadTires;
    }

    public Bulldozer() {

    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
