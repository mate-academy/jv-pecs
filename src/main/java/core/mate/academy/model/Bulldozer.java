package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeWidth;
    private double weight;

    public Bulldozer(String name, String color, double bladeWidth, double weight) {
        super(name,color);
        this.bladeWidth = bladeWidth;
        this.weight = weight;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public Bulldozer setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public Bulldozer setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
