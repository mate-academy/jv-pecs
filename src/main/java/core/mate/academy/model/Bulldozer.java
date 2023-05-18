package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int enginePower;
    private int bladeWidth;

    public Bulldozer() {
        super("default_name", "default_color");
    }

    public Bulldozer(String name, String color, int enginePower, int bladeWidth) {
        super(name, color);
        this.enginePower = enginePower;
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
