package core.mate.academy.model;

public class Excavator extends Machine {
    private double lengthOfBoom;
    private int dipperSize;

    public Excavator() {
    }

    public Excavator(double lengthOfBoom, int dipperSize) {
        this.lengthOfBoom = lengthOfBoom;
        this.dipperSize = dipperSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
