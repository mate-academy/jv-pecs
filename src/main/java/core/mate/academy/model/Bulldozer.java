package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeCapacity;

    public Bulldozer() {

    }

    public Bulldozer(String name, String color, double bladeCapacity) {
        super(name, color);
        this.bladeCapacity = bladeCapacity;
    }

    public double getBladeCapacity() {
        return bladeCapacity;
    }

    public void setBladeCapacity(double bladeCapacity) {
        this.bladeCapacity = bladeCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
