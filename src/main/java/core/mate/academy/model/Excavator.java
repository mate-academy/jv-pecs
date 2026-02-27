package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int amountOfBucketTeeth;
    private double wheelDiameter;

    public Excavator() {
    }

    public Excavator(int amountOfBucketTeeth, double wheelDiameter) {
        this.amountOfBucketTeeth = amountOfBucketTeeth;
        this.wheelDiameter = wheelDiameter;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public int getAmountOfBucketTeeth() {
        return amountOfBucketTeeth;
    }

    public void setAmountOfBucketTeeth(int amountOfBucketTeeth) {
        this.amountOfBucketTeeth = amountOfBucketTeeth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
