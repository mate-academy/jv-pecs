package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeWidth;

    public Bulldozer(String name, int year, int bladeWidth) {
        super(name, year);
        this.bladeWidth = bladeWidth;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
