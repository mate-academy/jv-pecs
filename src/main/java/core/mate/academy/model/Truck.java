package core.mate.academy.model;

public class Truck extends Machine {
    private int cargoCapacity;
    private boolean hasTrailer;

    public Truck() {
    }

    public Truck(String name, String color, int cargoCapacity, boolean hasTrailer) {
        super(name, color);
        this.cargoCapacity = cargoCapacity;
        this.hasTrailer = hasTrailer;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public boolean hasTrailer() {
        return hasTrailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
