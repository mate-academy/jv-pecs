package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int power;
    private double bucketVolume;
    private boolean isEngineElectric;

    public Excavator(String name, String colour, int power,
                     double bucketVolume, boolean isEngineElectric) {
        setName(name);
        setColor(colour);
        this.power = power;
        this.bucketVolume = bucketVolume;
        this.isEngineElectric = isEngineElectric;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
