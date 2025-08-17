package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int wheelsNumber;
    private boolean withTrailer;

    public Truck() {
    }

    public Truck(String name, int wheelsNumber, boolean withTrailer, String color) {
        this.setName(name);
        this.wheelsNumber = wheelsNumber;
        this.withTrailer = withTrailer;
        this.setColor(color);
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public boolean isWithTrailer() {
        return withTrailer;
    }

    public void setWithTrailer(boolean withTrailer) {
        this.withTrailer = withTrailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
