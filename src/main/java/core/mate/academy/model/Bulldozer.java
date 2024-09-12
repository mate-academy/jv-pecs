package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int horsePower;
    private String model;
    private int engineHours;

    public Bulldozer() {
    }

    public Bulldozer(String model, int horsePower, int engineHours) {
        this.model = model;
        this.horsePower = horsePower;
        this.engineHours = engineHours;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
