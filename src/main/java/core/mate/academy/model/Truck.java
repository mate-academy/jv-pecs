package core.mate.academy.model;

public class Truck extends Machine {
    private int horsePowers;

    public Truck() {
    }

    public Truck(String name, String color, int horsePowers) {
        super(name, color);
        this.horsePowers = horsePowers;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
