package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int turningRadius;
    private int boomLength;
    private int armLength;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public void setTurningRadius(int turningRadius) {
        this.turningRadius = turningRadius;
    }

    public void setBoomLength(int boomLength) {
        this.boomLength = boomLength;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }
}
