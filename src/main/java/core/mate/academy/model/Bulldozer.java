package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String brand;
    private int horsePower;
    private boolean isWorking;

    public Bulldozer() {
    }

    public Bulldozer(String brand, int horsePower) {
        this.brand = brand;
        this.horsePower = horsePower;
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
