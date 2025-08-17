package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int weigh;

    public Excavator() {
    }

    public Excavator(int weigh) {
        this.weigh = weigh;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
