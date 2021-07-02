package core.mate.academy.model;

public class Excavator extends Machine {
    private double weight;

    public Excavator() {
    }

    public Excavator(String name, String color, double weight) {
        super(name, color);
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
