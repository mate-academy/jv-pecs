package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeSize;
    private String wheelType;

    public Bulldozer() {
    }

    public int getBladeSize() {
        return bladeSize;
    }

    public void setBladeSize(int bladeSize) {
        this.bladeSize = bladeSize;
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
