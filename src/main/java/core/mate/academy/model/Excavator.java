package core.mate.academy.model;

public class Excavator extends Machine {

    private double boomLength;

    public Excavator(String name, String color, double boomLength) {
        super(name, color);
        this.boomLength = boomLength;
    }

    public Excavator() {
        super();
    }

    public double getBoomLength() {
        return boomLength;
    }

    public void setBoomLength(double boomLength) {
        this.boomLength = boomLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
