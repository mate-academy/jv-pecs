package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int paramExcavator1;
    private String paramExcavator2;

    public Excavator() {
    }

    public Excavator(int paramExcavator1, String paramExcavator2) {
        this.paramExcavator1 = paramExcavator1;
        this.paramExcavator2 = paramExcavator2;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
