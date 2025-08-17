package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int boom;

    public Excavator() {
    }

    public Excavator(String name, String color, int boom) {
        super(name, color);
        this.boom = boom;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getBoom() {
        return boom;
    }

    public void setBoom(int boom) {
        this.boom = boom;
    }
}
