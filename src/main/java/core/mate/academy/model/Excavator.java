package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketVolume;

    public Excavator() {
    }

    public Excavator(int bucketVolume, String name, String color) {
        this.bucketVolume = bucketVolume;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
