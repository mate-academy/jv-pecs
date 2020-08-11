package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int power;
    private int speed;

    public Bulldozer() {
    }

    public Bulldozer(int power, int speed) {
        this.power = power;
        this.speed = speed;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
