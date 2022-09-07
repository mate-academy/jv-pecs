package core.mate.academy.model;

public class Truck extends Machine {
    private String brand;
    private int horsePower;
    private boolean isWorking;

    public Truck() {
    }

    public Truck(String brand, int horsePower) {
        this.brand = brand;
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        isWorking = true;
        if (brand != null) {
            System.out.println("Truck " + brand + " started to work");
        } else {
            System.out.println("Truck started to work");
        }
    }
}
