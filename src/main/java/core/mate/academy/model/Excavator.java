package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double caterpillarLength;

    public Excavator() {
    }

    public Excavator(double caterpillarLength) {
        this.caterpillarLength = caterpillarLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public double getCaterpillarLength() {
        return caterpillarLength;
    }

    public void setCaterpillarLength(double caterpillarLength) {
        this.caterpillarLength = caterpillarLength;
    }
}
