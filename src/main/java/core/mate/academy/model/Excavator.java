package core.mate.academy.model;

public class Excavator extends Machine {
    private double maxDiggingDepth;
    private double maxReach;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
