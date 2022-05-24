package core.mate.academy.model;

import java.util.StringJoiner;

public class Truck extends Machine {
    private int year;
    private int mileage;

    public Truck() {
    }

    public Truck(String name, String color, int year, int mileage) {
        setName(name);
        setColor(color);
        this.year = year;
        this.mileage = mileage;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Truck.class.getSimpleName() + "[", "]")
                .add(super.toString())
                .add("year=" + year)
                .add("mileage='" + mileage + "'")
                .toString();
    }
}
