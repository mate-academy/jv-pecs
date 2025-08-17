package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int yearOfProduction;
    private int bucketVolume;

    public Excavator() {
    }

    public Excavator(String name, String color, int yearOfProduction, int bucketVolume) {
        super(name, color);
        this.yearOfProduction = yearOfProduction;
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
