package core.mate.academy.model;

public class Excavator extends Machine {
    private int weight;
    private int platformTurningRadius;

    public Excavator() {
    }

    public Excavator(String name, String color, int weight, int platformTurningRadius) {
        super(name, color);
        this.weight = weight;
        this.platformTurningRadius = platformTurningRadius;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
