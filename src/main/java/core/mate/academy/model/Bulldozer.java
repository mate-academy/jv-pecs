package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bulldozerSpeed;
    private String bulldozerColor;

    public Bulldozer() {
    }

    public int getBulldozerSpeed() {
        return bulldozerSpeed;
    }

    public void setBulldozerSpeed(int bulldozerSpeed) {
        this.bulldozerSpeed = bulldozerSpeed;
    }

    public String getBulldozerColor() {
        return bulldozerColor;
    }

    public void setBulldozerColor(String bulldozerColor) {
        this.bulldozerColor = bulldozerColor;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
