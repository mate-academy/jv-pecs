package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int maxSpeed;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int maxSpeed) {
        setName(name);
        setColor(color);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
