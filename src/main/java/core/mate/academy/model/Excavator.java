package core.mate.academy.model;

public class Excavator extends Machine {
    private double armLength;
    private boolean hasBreaker;
    private int maxLoadCapacity;

    public Excavator() {
        super("default_name", "default_color");
    }

    public Excavator(String name, String color, double armLength, boolean hasBreaker,
            int maxLoadCapacity) {
        super(name, color);
        this.armLength = armLength;
        this.hasBreaker = hasBreaker;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
