package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketVolume;
    private int countOfCylinders;

    public Excavator() {
    }

    public Excavator(int bucketVolume, int countOfCylinders) {
        this.bucketVolume = bucketVolume;
        this.countOfCylinders = countOfCylinders;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
