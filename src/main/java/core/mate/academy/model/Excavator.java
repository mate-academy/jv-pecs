package core.mate.academy.model;

public class Excavator extends Machine {
    private int armLength;

    public Excavator() {
    }

    public Excavator(String name, String color, int armLength) {
        super(name, color);
        this.armLength = armLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
