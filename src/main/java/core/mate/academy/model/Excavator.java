package core.mate.academy.model;

import java.util.StringJoiner;

public class Excavator extends Machine {
    private double cost;

    public Excavator() {
    }

    public Excavator(String name, String color, double cost) {
        setName(name);
        setColor(color);
        this.cost = cost;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Excavator.class.getSimpleName() + "[", "]")
                .add(super.toString())
                .add("cost=" + cost)
                .toString();
    }
}
