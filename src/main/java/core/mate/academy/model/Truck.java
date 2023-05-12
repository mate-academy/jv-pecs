package core.mate.academy.model;

public class Truck extends Machine {
    private String model;
    private String specialization;

    public Truck(String name, String color, String model, String specialization) {
        super(name, color);
        this.model = model;
        this.specialization = specialization;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
