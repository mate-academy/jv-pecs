package core.mate.academy.model;

public class Excavator extends Machine {
    private Integer wheelsCount;

    public Excavator() {
    }

    public Excavator(String name, String color, Integer wheelsCount) {
        super(name, color);
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
