package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int numberOfWheels;
    private String model;
    private int power;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
