package core.mate.academy.model;

public class Truck extends Machine {
    private String manufacturer;
    private int horsePower;

    public Truck() {
    }

    public Truck(String manufacturer, int horsePower) {
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
