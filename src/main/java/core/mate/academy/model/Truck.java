package core.mate.academy.model;

public class Truck extends Machine {
    private int truckYear;

    public Truck(String name, String color, int truckYear) {
        super(name, color);
        this.truckYear = truckYear;
    }

    public Truck() {
    }

    public int getTruckYear() {
        return truckYear;
    }

    public void setTruckYear(int truckYear) {
        this.truckYear = truckYear;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
