package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String walkingMode;
    private String bladeType;

    public Bulldozer() {
    }

    public String getWalkingMode() {
        return walkingMode;
    }

    public void setWalkingMode(String walkingMode) {
        this.walkingMode = walkingMode;
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
