package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int manipulatorLength;
    private int bucketVolume;

    public Excavator() {
    }

    public Excavator(String name, String color, int manipulatorLength, int bucketVolume) {
        setName(name);
        setColor(color);
        this.manipulatorLength = manipulatorLength;
        this.bucketVolume = bucketVolume;
    }

    public int getManipulatorLength() {
        return manipulatorLength;
    }

    public void setManipulatorLength(int manipulatorLength) {
        this.manipulatorLength = manipulatorLength;
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(int bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
