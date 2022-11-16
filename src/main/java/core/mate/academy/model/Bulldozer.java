package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int axis;

    public Bulldozer() {
    }

    public Bulldozer(int axis) {
        this.axis = axis;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getAxis() {
        return axis;
    }

    public void setAxis(int axis) {
        this.axis = axis;
    }
}


