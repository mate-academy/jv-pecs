package core.mate.academy.model;

public class Excavator extends Machine {
    private String workingPrinciple;
    private double ladleCapacity;

    public Excavator() {
    }

    public Excavator(String workingPrinciple, double ladleCapacity) {
        this.workingPrinciple = workingPrinciple;
        this.ladleCapacity = ladleCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
