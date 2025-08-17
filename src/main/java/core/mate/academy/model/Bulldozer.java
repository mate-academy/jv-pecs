package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String model;
    private double price;

    public Bulldozer() {
    }

    public Bulldozer(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
