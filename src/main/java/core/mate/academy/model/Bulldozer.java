package core.mate.academy.model;

import java.util.Objects;

/**
 * Add some custom fields that could be only in BulldozerProducer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double weight;
    private int yearOfManufacture;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double weight, int yearOfManufacture) {
        super(name, color);
        this.weight = weight;
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bulldozer bulldozer = (Bulldozer) o;
        return Double.compare(weight, bulldozer.weight) == 0
                && yearOfManufacture == bulldozer.yearOfManufacture;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, yearOfManufacture);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
