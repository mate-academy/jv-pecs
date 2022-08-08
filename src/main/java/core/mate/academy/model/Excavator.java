package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketVolume;
    private int weight;

    public Excavator() {
    }

    public Excavator(int bucketVolume, int weight, String color) {
        this.bucketVolume = bucketVolume;
        this.weight = weight;
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
