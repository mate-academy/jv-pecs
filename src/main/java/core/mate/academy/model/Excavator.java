package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int lengthStick;
    private double volumeBucket;

    public Excavator() {
    }

    public void setLengthStick(int lengthStick) {
        this.lengthStick = lengthStick;
    }

    public void setVolumeBucket(int volumeBucket) {
        this.volumeBucket = volumeBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
