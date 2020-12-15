package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int pushingPower;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int pushingPower) {
        super(name, color);
        this.pushingPower = pushingPower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getPushingPower() {
        return pushingPower;
    }

    public void setPushingPower(int pushingPower) {
        this.pushingPower = pushingPower;
    }
}
