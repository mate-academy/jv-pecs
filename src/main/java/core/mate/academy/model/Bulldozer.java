package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeType;

    public Bulldozer(String name, String color, String bladeType) {
        super(name, color);
        this.bladeType = bladeType;
    }

    public Bulldozer() {
        super("Bulldozer", "Grey");
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer " + getName() + " started to work");
    }
}
