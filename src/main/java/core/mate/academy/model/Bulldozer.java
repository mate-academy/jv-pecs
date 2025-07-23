package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeWidth;
    private double bladeHeight;
    private double maxPushWeight;
    private String terrainType;

    public Bulldozer() {
    }

    public Bulldozer(double bladeWidth, double bladeHeight,
                     double maxPushWeight, String terrainType) {
        this.bladeWidth = bladeWidth;
        this.bladeHeight = bladeHeight;
        this.maxPushWeight = maxPushWeight;
        this.terrainType = terrainType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
