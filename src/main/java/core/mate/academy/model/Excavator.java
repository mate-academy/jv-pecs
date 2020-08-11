package core.mate.academy.model;

public class Excavator extends Machine {
    private int integrityOfManipulator;
    private int maxLiftingWeight;

    public Excavator() {
    }

    public Excavator(String name, String color, int integrityOfManipulator, int maxLiftingWeight) {
        super(name, color);
        this.integrityOfManipulator = integrityOfManipulator;
        this.maxLiftingWeight = maxLiftingWeight;
    }

    public int getIntegrityOfManipulator() {
        return integrityOfManipulator;
    }

    public void setIntegrityOfManipulator(int integrityOfManipulator) {
        this.integrityOfManipulator = integrityOfManipulator;
    }

    public int getMaxLiftingWeight() {
        return maxLiftingWeight;
    }

    public void setMaxLiftingWeight(int maxLiftingWeight) {
        this.maxLiftingWeight = maxLiftingWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
