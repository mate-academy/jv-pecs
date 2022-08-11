package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int length;
    private String typeTruck;
    private String kindOfFuel;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTypeTruck() {
        return typeTruck;
    }

    public void setTypeTruck(String typeTruck) {
        this.typeTruck = typeTruck;
    }

    public String getKindOfFuel() {
        return kindOfFuel;
    }

    public void setKindOfFuel(String kindOfFuel) {
        this.kindOfFuel = kindOfFuel;
    }
}
