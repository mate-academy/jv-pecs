package core.mate.academy.model;

public class Excavator extends Machine {
    private String name;
    private String color;
    private double weight;

    public Excavator() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
