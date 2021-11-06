package core.mate.academy.model;

public class Excavator extends Machine {
    double boomLength;
    String workZone;

    public Excavator() {
    }

    public Excavator(String name, String color, double boomLength, String workZone) {
        super(name, color);
        this.boomLength = boomLength;
        this.workZone = workZone;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
