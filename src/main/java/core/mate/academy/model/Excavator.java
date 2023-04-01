package core.mate.academy.model;

public class Excavator extends Machine {
    private int wheelsCount;

    public Excavator() {
    }

    public Excavator(String name, String color, int wheelsCount) {
        super(name, color);
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
