package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String engine;
    private int maxSpeedKmH;
    private boolean isEcoFriendly;

    public Bulldozer() {
    }

    public Bulldozer(String engine, int maxSpeedKmH, boolean isEcoFriendly) {
        this.engine = engine;
        this.maxSpeedKmH = maxSpeedKmH;
        this.isEcoFriendly = isEcoFriendly;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getMaxSpeedKmH() {
        return maxSpeedKmH;
    }

    public void setMaxSpeedKmH(int maxSpeedKmH) {
        this.maxSpeedKmH = maxSpeedKmH;
    }

    public boolean isEcoFriendly() {
        return isEcoFriendly;
    }

    public void setEcoFriendly(boolean ecoFriendly) {
        isEcoFriendly = ecoFriendly;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
