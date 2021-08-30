package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketVolume;
    private String excavatorView;

    public Excavator() {
    }

    public Excavator(int bucketVolume, String excavatorView) {
        this.bucketVolume = bucketVolume;
        this.excavatorView = excavatorView;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
