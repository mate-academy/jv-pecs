package core.mate.academy.model;

public class Excavator extends Machine {

    private int excavatorLength;

    public Excavator() {
    }

    public Excavator(String name, String color, int excavatorLength) {
        super(name, color);
        this.excavatorLength = excavatorLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
