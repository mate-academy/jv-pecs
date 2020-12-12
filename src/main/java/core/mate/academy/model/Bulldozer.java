package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int BulldozerSpeed;
    private String BulldozerColor;

    public int getBulldozerSpeed() {
        return BulldozerSpeed;
    }

    public void setBulldozerSpeed(int bulldozerSpeed) {
        BulldozerSpeed = bulldozerSpeed;
    }

    public String getBulldozerColor() {
        return BulldozerColor;
    }

    public void setBulldozerColor(String bulldozerColor) {
        BulldozerColor = bulldozerColor;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
