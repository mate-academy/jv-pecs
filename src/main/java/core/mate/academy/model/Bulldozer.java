package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double weight;
    private double bladeWidth;
    private double height;

    public Bulldozer() {
        super(null, null);
    }

    public Bulldozer(String name, String color, double weight, double bladeWidth, double height) {
        super(name, color);
        this.weight = weight;
        this.bladeWidth = bladeWidth;
        this.height = height;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String toString() {
        return "Bulldozer{"
                + super.toString()
                + "weight=" + weight
                + ", bladeWidth=" + bladeWidth
                + ", height=" + height
                + "}\n";
    }
}
