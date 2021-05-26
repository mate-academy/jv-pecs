package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketVolume;
    private  double arrowLenght;

    public Excavator(int bucketVolume, double arrowLenght) {
        this.bucketVolume = bucketVolume;
        this.arrowLenght = arrowLenght;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
