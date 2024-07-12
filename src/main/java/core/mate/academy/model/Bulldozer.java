package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeWidth;

    public Bulldozer() {
        this("DefaultModel", "DefaultColor", 0);
    }

    public Bulldozer(String model, String color, int bladeWidth) {
        setName(model);
        setColor(color);
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer " + getName() + " is working.");
    }
}
