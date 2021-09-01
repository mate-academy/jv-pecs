package core.mate.academy.model;

public class Truck extends Machine {
    private int numberOfAxles;
    private boolean hasSleeper;
    private boolean hasSemiTrailer;

    public Truck(int numberOfAxles, boolean hasSleeper, boolean hasSemiTrailer,
                 String name, String color) {
        this.numberOfAxles = numberOfAxles;
        this.hasSleeper = hasSleeper;
        this.hasSemiTrailer = hasSemiTrailer;
        super.setName(name);
        super.setColor(color);
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
