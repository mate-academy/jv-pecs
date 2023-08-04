package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketVolume;
    private int cargoHeight;

    public Excavator() {
    }

    public Excavator(String name, String color) {
        setName(name);
        setColor(color);
    }

    public Excavator(String name, String color, int bucketVolume, int cargoHeight) {
        super(name, color);
        this.bucketVolume = bucketVolume;
        this.cargoHeight = cargoHeight;
    }

    public void setBucketVolume(int bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public void setCargoHeight(int cargoHeight) {
        this.cargoHeight = cargoHeight;
    }

    public int getCargoHeight() {
        return cargoHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
