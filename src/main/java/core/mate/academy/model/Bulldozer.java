package core.mate.academy.model;

public class Bulldozer extends Machine {

    private int bladeLength;
    private int bladeWidth;

    public Bulldozer() {
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
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
