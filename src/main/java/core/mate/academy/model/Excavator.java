package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int id;
    private String model;

    public Excavator() {
    }

    public Excavator(int id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
