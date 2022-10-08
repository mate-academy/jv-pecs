package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int cost;
    private String madeOf;

    public Excavator() {
    }

    public Excavator(int cost, String madeOf) {
        this.cost = cost;
        this.madeOf = madeOf;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
