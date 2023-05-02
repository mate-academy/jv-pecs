package core.mate.academy.model;

public class Truck extends Machine {
    private int maxPayloadCapacity;
    private boolean hasTrailer;
    private String truckType;

    public Truck() {
        super("default_name", "default_color");
    }

    public Truck(String name, String color, int maxPayloadCapacity,
                 boolean hasTrailer, String truckType) {
        super(name, color);
        this.maxPayloadCapacity = maxPayloadCapacity;
        this.hasTrailer = hasTrailer;
        this.truckType = truckType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
