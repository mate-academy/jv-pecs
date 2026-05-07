package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int enginePower;
    private int bulldozerHeight;

    public Bulldozer() {
    }

    public Bulldozer(int enginePower, int bulldozerHeight) {
        this.enginePower = enginePower;
        this.bulldozerHeight = bulldozerHeight;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getBulldozerHeight() {
        return bulldozerHeight;
    }

    public void setBulldozerHeight(int bulldozerHeight) {
        this.bulldozerHeight = bulldozerHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
