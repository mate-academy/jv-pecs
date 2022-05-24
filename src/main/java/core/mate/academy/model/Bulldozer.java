package core.mate.academy.model;

import java.util.StringJoiner;

public class Bulldozer extends Machine {
    private int year;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int year) {
        setName(name);
        setColor(color);
        this.year = year;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Bulldozer.class.getSimpleName() + "[", "]")
                .add(super.toString())
                .add("year=" + year)
                .toString();
    }
}
