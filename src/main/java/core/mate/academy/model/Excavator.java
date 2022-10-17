package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int sizeBucket;
    private int lengthHand;

    public Excavator() {
    }

    public Excavator(int sizeBucket, int lengthHand) {
        this.sizeBucket = sizeBucket;
        this.lengthHand = lengthHand;
    }

    public int getSizeBucket() {
        return sizeBucket;
    }

    public void setSizeBucket(int sizeBucket) {
        this.sizeBucket = sizeBucket;
    }

    public int getLengthHand() {
        return lengthHand;
    }

    public void setLengthHand(int lengthHand) {
        this.lengthHand = lengthHand;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
