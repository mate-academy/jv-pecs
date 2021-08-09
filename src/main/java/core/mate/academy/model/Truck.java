package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String color;
    private int numberOfRidges;

    public Truck() {
    }

    public Truck(String color, int numberOfRidges) {
        this.color = color;
        this.numberOfRidges = numberOfRidges;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfRidges() {
        return numberOfRidges;
    }

    public void setNumberOfRidges(int numberOfRidges) {
        this.numberOfRidges = numberOfRidges;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String toString() {
        return "Truck{"
                + "color='" + color + '\''
                + ", numberOfRidges=" + numberOfRidges
                + '}';
    }
}
