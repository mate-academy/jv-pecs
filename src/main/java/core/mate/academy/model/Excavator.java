package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String model;
    private int id;

    public Excavator() {
    }

    public Excavator(String model, int id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
