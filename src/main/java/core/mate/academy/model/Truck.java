package core.mate.academy.model;

public class Truck extends Machine {
    private int serialNumber;
    private String model;
    private boolean isElectric;

    public Truck() {

    }

    public Truck(int serialNumber, String model, boolean isElectric) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.isElectric = isElectric;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
