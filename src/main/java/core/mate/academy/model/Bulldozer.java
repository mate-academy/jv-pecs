package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeSize;

    public Bulldozer() {
    }

    public int getBladeSize() {
        return bladeSize;
    }

    public void setBladeSize(int bladeSize) {
        this.bladeSize = bladeSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
