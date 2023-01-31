package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String model;
    private int bucketVolume;

    public Excavator(){
    }

    public Excavator(String name, String color, String model, int bucketVolume) {
        super(name, color);
        this.model = model;
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
