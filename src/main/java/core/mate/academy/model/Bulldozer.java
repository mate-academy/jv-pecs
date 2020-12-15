package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int productivity;

    public Bulldozer() {
    }

    public int getProductivity() {
        return productivity;
    }

    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
