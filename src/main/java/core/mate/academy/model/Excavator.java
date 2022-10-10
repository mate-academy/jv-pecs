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

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public int getTurningRadius() {
        return turningRadius;
    }

    public void setTurningRadius(int turningRadius) {
        this.turningRadius = turningRadius;
    }

    public int getBoomLength() {
        return boomLength;
    }

    public void setBoomLength(int boomLength) {
        this.boomLength = boomLength;
    }

    public int getArmLength() {
        return armLength;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }
}
