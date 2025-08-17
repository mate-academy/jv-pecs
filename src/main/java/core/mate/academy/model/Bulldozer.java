package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeWidth;
    private int enginePower;
    private String fuelType;

    public Bulldozer() {
        super("default_name", "default_color");
    }

    public Bulldozer(String name, String color, int bladeWidth, int enginePower, String fuelType) {
        super(name, color);
        this.bladeWidth = bladeWidth;
        this.enginePower = enginePower;
        this.fuelType = fuelType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
