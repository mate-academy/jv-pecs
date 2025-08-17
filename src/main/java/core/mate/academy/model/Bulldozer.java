package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeServiceHours;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bladeServiceHours) {
        super(name, color);
        this.bladeServiceHours = bladeServiceHours;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
