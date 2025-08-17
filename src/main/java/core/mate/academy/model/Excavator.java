package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String scoopType;
    private double scoopWeight;

    public Excavator() {
    }

    public String getScoopType() {
        return scoopType;
    }

    public double getScoopWeight() {
        return scoopWeight;
    }

    public void setScoopType(String scoopType) {
        this.scoopType = scoopType;
    }

    public void setScoopWeight(double scoopWeight) {
        this.scoopWeight = scoopWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
