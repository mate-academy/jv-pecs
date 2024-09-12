package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int horsePower;
    private String model;
    private int engineHours;

    public Excavator() {
    }

    public Excavator(String model, int horsePower, int engineHours) {
        this.model = model;
        this.horsePower = horsePower;
        this.engineHours = engineHours;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
