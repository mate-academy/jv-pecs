package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int degreeOfFreedom;
    private double maxLiftHeight;

    public Excavator() {
    }

    public Excavator(int degreeOfFreedom, double maxLiftHeight) {
        this.degreeOfFreedom = degreeOfFreedom;
        this.maxLiftHeight = maxLiftHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getDegreeOfFreedom() {
        return degreeOfFreedom;
    }

    public Excavator setDegreeOfFreedom(int degreeOfFreedom) {
        this.degreeOfFreedom = degreeOfFreedom;
        return this;
    }
}
