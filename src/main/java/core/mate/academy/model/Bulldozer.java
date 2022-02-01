package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int power;
    private String brand;

    public Bulldozer() {
    }

    public Bulldozer(int power, String brand) {
        this.power = power;
        this.brand = brand;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
