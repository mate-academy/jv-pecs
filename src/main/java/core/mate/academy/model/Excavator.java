package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double degreeOfFreedom;
    private double maxLiftHeight;

    public Excavator() {
    }

    public Excavator(double bucketVolume) {
        this.degreeOfFreedom = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public double getDegreeOfFreedom() {
        return degreeOfFreedom;
    }

    public Excavator setDegreeOfFreedom(double degreeOfFreedom) {
        this.degreeOfFreedom = degreeOfFreedom;
        return this;
    }
}
