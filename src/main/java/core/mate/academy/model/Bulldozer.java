package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int ladleSize;
    private int speed;

    public Bulldozer() {
    }

    public Bulldozer(int ladleSize, int speed) {
        this.ladleSize = ladleSize;
        this.speed = speed;
    }

    public int getLadleSize() {
        return ladleSize;
    }

    public void setLadleSize(int ladleSize) {
        this.ladleSize = ladleSize;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
