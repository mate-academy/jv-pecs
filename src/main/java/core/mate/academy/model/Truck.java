package core.mate.academy.model;

public class Truck extends Machine {
    private int manufactureYear;
    private int truckLength;
    private int horsePower;

    public Truck() {
    }

    public Truck(String name, String color, int manufactureYear, int truckLength, int horsePower) {
        super(name, color);
        this.manufactureYear = manufactureYear;
        this.truckLength = truckLength;
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
