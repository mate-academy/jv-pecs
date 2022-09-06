package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String brand;
    private int engineCapacity;
    private boolean isWorking;

    public Bulldozer() {
    }

    public Bulldozer(String brand, int engineCapacity) {
        this.brand = brand;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void doWork() {
        isWorking = true;
        if (brand != null) {
            System.out.println("Bulldozer " + brand + " started to work");
        } else {
            System.out.println("Bulldozer started to work");
        }
    }
}
