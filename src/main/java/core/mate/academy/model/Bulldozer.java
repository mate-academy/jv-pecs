package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeWidth;
    private int bladeHeight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bladeWidth, int bladeHeight) {
        super(name, color);
        this.bladeWidth = bladeWidth;
        this.bladeHeight = bladeHeight;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public int getBladeHeight() {
        return bladeHeight;
    }

    public void setBladeHeight(int bladeHeight) {
        this.bladeHeight = bladeHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
