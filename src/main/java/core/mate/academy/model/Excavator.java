package core.mate.academy.model;

public class Excavator extends Machine {
    private double capacityLadle;

    public Excavator() {
    }

    public Excavator(double capacityLadle) {
        this.capacityLadle = capacityLadle;
    }

    public double getCapacityLadle() {
        return capacityLadle;
    }

    public void setCapacityLadle(double capacityLadle) {
        this.capacityLadle = capacityLadle;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
