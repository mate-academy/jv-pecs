package core.mate.academy.model;

public class Bulldozer extends Machine {
    private boolean bucketRaised;
    private int speed;
    private String color;

    public Bulldozer() {
    }

    public Bulldozer(boolean bucketRaised, int speed, String color) {
        this.bucketRaised = bucketRaised;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
