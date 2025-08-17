package core.mate.academy.model;

public class Excavator extends Machine {
    private String model;
    private double price;

    public Excavator() {
    }

    public Excavator(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
